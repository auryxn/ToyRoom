
//здесь все параметры игрушек(по идеи здесь добавишь то что игрушки имеют цену)



class Toy {
    private String category;
    private String subcategory;
    private String size;
    private String ageGroup;

    public Toy(String category, String subcategory, String size, String ageGroup) {
        this.category = category;
        this.subcategory = subcategory;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public String getSize() {
        return size;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Subcategory: " + subcategory + ", Size: " + size + ", Age Group: " + ageGroup;
    }
}
