package by.bsu.task8.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advertisement {
    private String id;
    private String description;
    private LocalDate creationDate;
    private String webLink;
    private String vendor;
    private String photoLink;
    private LocalDate deadlineDate;
    private int discount;
    private float rating;
    private List<String> hashTags;

    public Advertisement(){}

    public Advertisement(String id, String description, LocalDate creationDate, String webLink, String vendor, String photoLink, LocalDate deadlineDate, int discount, float rating, List<String> hashTags) {
        this.id = id;
        this.description = description;
        this.creationDate = creationDate;
        this.webLink = webLink;
        this.vendor = vendor;
        this.photoLink = photoLink;
        this.deadlineDate = deadlineDate;
        this.discount = discount;
        this.rating = rating;
        this.hashTags = hashTags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(LocalDate deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<String> hashTags) {
        this.hashTags = hashTags;
    }

    public static boolean validate(Advertisement advertisement) {
        LocalDate currentDate = LocalDate.now();
        final String REGEX_ID = "\\d+";
        final String REGEX_DESCRIPTION = ".{1,300}";
        final String REGEX_WEBLINK = "[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";

        if (advertisement.getId() != null && advertisement.getId().compareTo("0") > 0  && advertisement.getId().compareTo("100") < 0 &&
                advertisement.getDescription() != null && advertisement.getDescription().matches(REGEX_DESCRIPTION) &&
                advertisement.getCreationDate() != null && advertisement.getCreationDate().isBefore(currentDate) &&
                advertisement.getWebLink() != null && advertisement.getWebLink().matches(REGEX_WEBLINK) &&
                advertisement.getVendor()!= null && !advertisement.getVendor().isEmpty() &&
                advertisement.getPhotoLink() != null && !advertisement.getPhotoLink().isEmpty() &&
                advertisement.getDeadlineDate() != null && advertisement.getDeadlineDate().isAfter(currentDate) &&
                advertisement.getDiscount() > 0 && advertisement.getDiscount() <= 100 &&
                advertisement.getRating() > 0 && advertisement.getRating() <= 10 &&
                advertisement.getHashTags() != null && !advertisement.getHashTags().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advertisement that = (Advertisement) o;

        if (discount != that.discount) return false;
        if (Float.compare(that.rating, rating) != 0) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (webLink != null ? !webLink.equals(that.webLink) : that.webLink != null) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (photoLink != null ? !photoLink.equals(that.photoLink) : that.photoLink != null) return false;
        if (deadlineDate != null ? !deadlineDate.equals(that.deadlineDate) : that.deadlineDate != null) return false;
        return hashTags != null ? hashTags.equals(that.hashTags) : that.hashTags == null;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (webLink != null ? webLink.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (photoLink != null ? photoLink.hashCode() : 0);
        result = 31 * result + (deadlineDate != null ? deadlineDate.hashCode() : 0);
        result = 31 * result + discount;
        result = 31 * result + (rating != +0.0f ? Float.floatToIntBits(rating) : 0);
        result = 31 * result + (hashTags != null ? hashTags.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Advertisement{");
        sb.append("id='").append(id).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", webLink='").append(webLink).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", photoLink='").append(photoLink).append('\'');
        sb.append(", deadlineDate=").append(deadlineDate);
        sb.append(", discount=").append(discount);
        sb.append(", rating=").append(rating);
        sb.append(", hashTags=").append(hashTags);
        sb.append('}');
        return sb.toString();
    }
}
