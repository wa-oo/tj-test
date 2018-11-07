package com.example.model;

public class MenuSubject {
    private String id;

    private String subjectName;

    private String parentId;

    private String parentName;

    private String 栏目分类父id;

    private String 栏目分类id;

    private String category;

    private String state;

    private String picPath;

    private String categorySort;

    private String describe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public String get栏目分类父id() {
        return 栏目分类父id;
    }

    public void set栏目分类父id(String 栏目分类父id) {
        this.栏目分类父id = 栏目分类父id == null ? null : 栏目分类父id.trim();
    }

    public String get栏目分类id() {
        return 栏目分类id;
    }

    public void set栏目分类id(String 栏目分类id) {
        this.栏目分类id = 栏目分类id == null ? null : 栏目分类id.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public String getCategorySort() {
        return categorySort;
    }

    public void setCategorySort(String categorySort) {
        this.categorySort = categorySort == null ? null : categorySort.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}