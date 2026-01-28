package anamaya.gopay.hotel.model.request;

import java.util.List;

public class SearchHotelRequestModel {

    private Integer page;
    private Integer count;
    private String key;
    private String area;
    private List<Boolean> stars;

    public SearchHotelRequestModel() {
        this.page = 0;
        this.count = 10;
        this.key = "";
        this.area = "";
        this.stars = List.of(false, false, false, false, true);
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Boolean> getStars() {
        return stars;
    }

    public void setStars(List<Boolean> stars) {
        this.stars = stars;
    }

    public String createKey() {
        return page + "|" + count + "|" + area + "|" + key + "|" + starsToString();
    }

    private String starsToString() {
        return stars != null ? stars.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + "," + b)
                .orElse("") : "";
    }
}
