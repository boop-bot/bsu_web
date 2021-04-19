package by.bsu.task8.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advertisement implements Cloneable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advertisement that = (Advertisement) o;

        if (discount != that.discount) return false;
        if (Float.compare(that.rating, rating) != 0) return false;
        if (!description.equals(that.description)) return false;
        if (!creationDate.equals(that.creationDate)) return false;
        if (!webLink.equals(that.webLink)) return false;
        if (!vendor.equals(that.vendor)) return false;
        if (!photoLink.equals(that.photoLink)) return false;
        if (!deadlineDate.equals(that.deadlineDate)) return false;
        return hashTags.equals(that.hashTags);
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + creationDate.hashCode();
        result = 31 * result + webLink.hashCode();
        result = 31 * result + vendor.hashCode();
        result = 31 * result + photoLink.hashCode();
        result = 31 * result + deadlineDate.hashCode();
        result = 31 * result + discount;
        result = 31 * result + (rating != +0.0f ? Float.floatToIntBits(rating) : 0);
        result = 31 * result + hashTags.hashCode();
        return result;
    }

    public Object clone()
    {
        Advertisement advertisement = new Advertisement();
        advertisement.setId(String.copyValueOf(this.id.toCharArray()));
        advertisement.setDescription(String.copyValueOf(this.description.toCharArray()));
        advertisement.setCreationDate(this.creationDate);
        advertisement.setWebLink(String.copyValueOf(this.webLink.toCharArray()));
        advertisement.setVendor(String.copyValueOf(this.vendor.toCharArray()));
        advertisement.setPhotoLink(String.copyValueOf(this.photoLink.toCharArray()));
        advertisement.setDeadlineDate(this.deadlineDate);
        advertisement.setDiscount(this.discount);
        advertisement.setRating(this.rating);
        advertisement.setHashTags(new ArrayList<>(this.hashTags));
        return advertisement;
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
