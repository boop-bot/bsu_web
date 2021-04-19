package by.bsu.task8.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdCollection {
    private List<Advertisement> advertisements;

    public AdCollection() {
        this.advertisements = new ArrayList<>();
    }

    public Advertisement get(String id) {
        try {
            Advertisement advertisement = advertisements.stream().filter(a->a.getId().equals(id)).findAny().get();
            return advertisement;
        } catch (NoSuchElementException e) {
            return null;
        }
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

        int index;
        try {
            index = IntStream.range(0, advertisements.size()).filter(i -> advertisements.get(i).getId().equals(id)).findFirst().getAsInt();
        } catch (NoSuchElementException e) {
            return false;
        }

        Advertisement adToEdit = (Advertisement) advertisements.get(index).clone();
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

        if (validate(adToEdit)) {
            advertisements.set(index, adToEdit);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(String id) {
        int index;
        try {
            index = IntStream.range(0, advertisements.size()).filter(i -> advertisements.get(i).getId().equals(id)).findFirst().getAsInt();
        } catch (NoSuchElementException e) {
            return false;
        }
        advertisements.remove(index);
        return true;
    }

    public boolean validate(Advertisement advertisement) {
        LocalDate currentDate = LocalDate.now();
        final String REGEX_ID = "\\d+";
        final String REGEX_DESCRIPTION = ".{1,300}";
        final String REGEX_WEBLINK = "[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";

        if (advertisement.getId().compareTo("0") > 0  && advertisement.getId().compareTo("100") < 0 &&
                advertisement.getDescription().matches(REGEX_DESCRIPTION) &&
                advertisement.getCreationDate().isBefore(currentDate) &&
                advertisement.getWebLink().matches(REGEX_WEBLINK) &&
                !advertisement.getVendor().isEmpty() &&
                !advertisement.getPhotoLink().isEmpty() &&
                advertisement.getDeadlineDate().isAfter(currentDate) &&
                advertisement.getDiscount() > 0 && advertisement.getDiscount() <= 100 &&
                advertisement.getRating() > 0 && advertisement.getRating() <= 10 &&
                !advertisement.getHashTags().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public List<Advertisement> addAll(List<Advertisement> advertisementList) {
        List<Advertisement> notValidatedAds = new ArrayList<>();
        advertisements.forEach(a-> {
            if (!add(a)) {
                notValidatedAds.add(a);
            }
        });
        return notValidatedAds;
    }

    public void clear() {
        advertisements.clear();
    }
}
