package ua.kharkov.epam.mitroshkina.taxiService.db.bean;

public class CategoryBean {
    private String category_name;
    private int count;

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
