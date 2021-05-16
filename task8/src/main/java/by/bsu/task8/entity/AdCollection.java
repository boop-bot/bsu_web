package by.bsu.task8.entity;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdCollection {
    private List<Advertisement> advertisements;

    public AdCollection() {
        this.advertisements = new ArrayList<>();
    }

    public Advertisement get(String id) {
        try {
            return advertisements.stream().filter(a->a.getId().equals(id)).findAny().get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public List<Advertisement> getAds(int skip, int top, AdFilter filter) {
        if (filter.getHashTags().size() == 0 && filter.getVendors().size() == 0) {
            return advertisements.stream().skip(skip).limit(top).collect(Collectors.toCollection(ArrayList::new));
        } else if (filter.getHashTags().size() == 0) {
            return filterByVendors(this.advertisements, filter.getVendors(), skip, top);
        } else if (filter.getVendors().size() == 0) {
            return filterByTags(this.advertisements, filter.getHashTags(), skip, top);
        }
        return filterByTags(filterByVendors(this.advertisements, filter.getVendors(), skip, top),
                filter.getHashTags(), 0, top);
    }

    public List<Advertisement> getAll() {
        return advertisements;
    }

    public boolean add(Advertisement advertisement) {
        if (advertisements.contains(advertisement)) {
            return false;
        }

        return true;
    }

    public boolean edit(String id, Advertisement advertisement) {
        if (advertisement.getVendor() != null || !advertisement.getId().isEmpty() || advertisement.getCreationDate() != null) {
            return false;
        }

        Advertisement currentAd = advertisements.stream().filter(ad -> ad.getId().equals(id)).findFirst().orElse(null);
        if (currentAd == null) {
            return false;
        }

        Advertisement adToEdit = new Advertisement();
        adToEdit.setId(currentAd.getId());
        adToEdit.setDescription(currentAd.getDescription());
        adToEdit.setCreationDate(currentAd.getCreationDate());
        adToEdit.setWebLink(currentAd.getWebLink());
        adToEdit.setVendor(currentAd.getVendor());
        adToEdit.setPhotoLink(currentAd.getPhotoLink());
        adToEdit.setDeadlineDate(currentAd.getDeadlineDate());
        adToEdit.setDiscount(currentAd.getDiscount());
        adToEdit.setRating(currentAd.getRating());
        adToEdit.setHashTags(new ArrayList<>(currentAd.getHashTags()));
        if (advertisement.getDescription() != null) {
            adToEdit.setDescription(advertisement.getDescription());
        }
        if (advertisement.getWebLink() != null) {
            adToEdit.setWebLink(advertisement.getWebLink());
        }
        if (advertisement.getPhotoLink() != null) {
            adToEdit.setPhotoLink(advertisement.getPhotoLink());
        }
        if (advertisement.getDeadlineDate() != null) {
            adToEdit.setDeadlineDate(advertisement.getDeadlineDate());
        }
        if (advertisement.getDiscount() != 0) {
            adToEdit.setDiscount(advertisement.getDiscount());
        }
        if (advertisement.getRating() != 0) {
            adToEdit.setRating(advertisement.getRating());
        }
        if (!advertisement.getHashTags().isEmpty()) {
            adToEdit.setHashTags(advertisement.getHashTags());
        }

        if (Advertisement.validate(adToEdit)) {
            currentAd.setId(adToEdit.getId());
            currentAd.setDescription(adToEdit.getDescription());
            currentAd.setCreationDate(adToEdit.getCreationDate());
            currentAd.setWebLink(adToEdit.getWebLink());
            currentAd.setVendor(adToEdit.getVendor());
            currentAd.setPhotoLink(adToEdit.getPhotoLink());
            currentAd.setDeadlineDate(adToEdit.getDeadlineDate());
            currentAd.setDiscount(adToEdit.getDiscount());
            currentAd.setRating(adToEdit.getRating());
            currentAd.setHashTags(adToEdit.getHashTags());
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String id) {
        Optional<Advertisement> ad = advertisements.stream().filter(e -> e.getId().equals(id)).findFirst();
        if(ad.isPresent()){
            advertisements.remove(ad.get());
            return true;
        }
        return false;
    }

    public void addAll(List<Advertisement> advertisementList) {
        advertisements.forEach(a-> {add(a);});
    }

    public void clear() {
        advertisements.clear();
    }

    private List<Advertisement> filterByVendors(List<Advertisement> ads, List<String> vendors,
                                     int skip, int top) {
        return ads.stream().filter(element -> vendors.contains(element.getVendor()))
                .skip(skip).limit(top).collect(Collectors.toCollection(ArrayList::new));
    }

    private List<Advertisement> filterByTags(List<Advertisement> ads, List<String> hashTags, int skip,
                                  int top) {
        return ads.stream().filter(element -> element.getHashTags().stream().anyMatch(hashTag -> hashTags.contains(hashTag)))
                .skip(skip).limit(top).collect(Collectors.toCollection(ArrayList::new));

    }
}
