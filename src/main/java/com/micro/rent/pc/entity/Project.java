package com.micro.rent.pc.entity;

public class Project {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.brand_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.branch_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long branchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.name
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.address_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long addressId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.property_type
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Object propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.description
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.flag
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Boolean flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.rank_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long rankGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.logo
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private String logo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.tagline
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private String tagline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.amenity_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Long amenityGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.project.total_house_number
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    private Integer totalHouseNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.id
     *
     * @return the value of public.project.id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.id
     *
     * @param id the value for public.project.id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.brand_id
     *
     * @return the value of public.project.brand_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.brand_id
     *
     * @param brandId the value for public.project.brand_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.branch_id
     *
     * @return the value of public.project.branch_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.branch_id
     *
     * @param branchId the value for public.project.branch_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.name
     *
     * @return the value of public.project.name
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.name
     *
     * @param name the value for public.project.name
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.address_id
     *
     * @return the value of public.project.address_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.address_id
     *
     * @param addressId the value for public.project.address_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.property_type
     *
     * @return the value of public.project.property_type
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Object getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.property_type
     *
     * @param propertyType the value for public.project.property_type
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setPropertyType(Object propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.description
     *
     * @return the value of public.project.description
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.description
     *
     * @param description the value for public.project.description
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.flag
     *
     * @return the value of public.project.flag
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.flag
     *
     * @param flag the value for public.project.flag
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.rank_group_id
     *
     * @return the value of public.project.rank_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getRankGroupId() {
        return rankGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.rank_group_id
     *
     * @param rankGroupId the value for public.project.rank_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setRankGroupId(Long rankGroupId) {
        this.rankGroupId = rankGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.logo
     *
     * @return the value of public.project.logo
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.logo
     *
     * @param logo the value for public.project.logo
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.tagline
     *
     * @return the value of public.project.tagline
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.tagline
     *
     * @param tagline the value for public.project.tagline
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setTagline(String tagline) {
        this.tagline = tagline == null ? null : tagline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.amenity_group_id
     *
     * @return the value of public.project.amenity_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Long getAmenityGroupId() {
        return amenityGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.amenity_group_id
     *
     * @param amenityGroupId the value for public.project.amenity_group_id
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setAmenityGroupId(Long amenityGroupId) {
        this.amenityGroupId = amenityGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.project.total_house_number
     *
     * @return the value of public.project.total_house_number
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public Integer getTotalHouseNumber() {
        return totalHouseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.project.total_house_number
     *
     * @param totalHouseNumber the value for public.project.total_house_number
     *
     * @mbggenerated Thu Feb 05 00:32:48 CST 2015
     */
    public void setTotalHouseNumber(Integer totalHouseNumber) {
        this.totalHouseNumber = totalHouseNumber;
    }
}