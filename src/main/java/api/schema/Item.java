package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Item {

    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("parentItemId")
    private Integer parentItemId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("salePrice")
    private Double salePrice;
    @JsonProperty("upc")
    private Double upc;
    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("mediumImage")
    private String mediumImage;
    @JsonProperty("largeImage")
    private String largeImage;
    @JsonProperty("productTrackingUrl")
    private String productTrackingUrl;
    @JsonProperty("standardShipRate")
    private Double standardShipRate;
    @JsonProperty("marketplace")
    private Boolean marketplace;
    @JsonProperty("sellerInfo")
    private String sellerInfo;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("categoryNode")
    private String categoryNode;
    @JsonProperty("rhid")
    private String rhid;
    @JsonProperty("bundle")
    private Boolean bundle;
    @JsonProperty("stock")
    private String stock;
    @JsonProperty("addToCartUrl")
    private String addToCartUrl;
    @JsonProperty("affiliateAddToCartUrl")
    private String affiliateAddToCartUrl;
    @JsonProperty("freeShippingOver35Dollars")
    private Boolean freeShippingOver35Dollars;
    @JsonProperty("imageEntities")
    private List<ImageEntity> imageEntities = null;
    @JsonProperty("offerType")
    private String offerType;
    @JsonProperty("availableOnline")
    private Boolean availableOnline;
    @JsonProperty("msrp")
    private Double msrp;
    @JsonProperty("giftOptions")
    private GiftOptions giftOptions;
    @JsonProperty("isTwoDayShippingEligible")
    private Boolean isTwoDayShippingEligible;

    /**
     * No args constructor for use in serialization
     */
    public Item() {
    }

    /**
     * @param freeShippingOver35Dollars
     * @param affiliateAddToCartUrl
     * @param standardShipRate
     * @param thumbnailImage
     * @param giftOptions
     * @param productTrackingUrl
     * @param stock
     * @param msrp
     * @param categoryNode
     * @param mediumImage
     * @param name
     * @param longDescription
     * @param bundle
     * @param addToCartUrl
     * @param marketplace
     * @param imageEntities
     * @param rhid
     * @param sellerInfo
     * @param largeImage
     * @param parentItemId
     * @param itemId
     * @param categoryPath
     * @param offerType
     * @param availableOnline
     * @param shortDescription
     * @param productUrl
     * @param salePrice
     * @param isTwoDayShippingEligible
     */
    public Item(Integer itemId, Integer parentItemId, String name, Double salePrice, String categoryPath, String shortDescription, String longDescription, String thumbnailImage, String mediumImage, String largeImage, String productTrackingUrl, Double standardShipRate, Boolean marketplace, String sellerInfo, String productUrl, String categoryNode, String rhid, Boolean bundle, String stock, String addToCartUrl, String affiliateAddToCartUrl, Boolean freeShippingOver35Dollars, List<ImageEntity> imageEntities, String offerType, Boolean availableOnline, Double msrp, GiftOptions giftOptions, Boolean isTwoDayShippingEligible) {
        super();
        this.itemId = itemId;
        this.parentItemId = parentItemId;
        this.name = name;
        this.salePrice = salePrice;
        this.categoryPath = categoryPath;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.productTrackingUrl = productTrackingUrl;
        this.standardShipRate = standardShipRate;
        this.marketplace = marketplace;
        this.sellerInfo = sellerInfo;
        this.productUrl = productUrl;
        this.categoryNode = categoryNode;
        this.rhid = rhid;
        this.bundle = bundle;
        this.stock = stock;
        this.addToCartUrl = addToCartUrl;
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
        this.imageEntities = imageEntities;
        this.offerType = offerType;
        this.availableOnline = availableOnline;
        this.msrp = msrp;
        this.giftOptions = giftOptions;
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    public Double getStandardShipRate() {
        return standardShipRate;
    }

    public void setStandardShipRate(Double standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    public Boolean getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    public String getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getCategoryNode() {
        return categoryNode;
    }

    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    public String getRhid() {
        return rhid;
    }

    public void setRhid(String rhid) {
        this.rhid = rhid;
    }

    public Boolean getBundle() {
        return bundle;
    }

    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    public Boolean getFreeShippingOver35Dollars() {
        return freeShippingOver35Dollars;
    }

    public void setFreeShippingOver35Dollars(Boolean freeShippingOver35Dollars) {
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
    }

    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    public Double getMsrp() {
        return msrp;
    }

    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public GiftOptions getGiftOptions() {
        return giftOptions;
    }

    public void setGiftOptions(GiftOptions giftOptions) {
        this.giftOptions = giftOptions;
    }

    public Boolean getIsTwoDayShippingEligible() {
        return isTwoDayShippingEligible;
    }

    public void setIsTwoDayShippingEligible(Boolean isTwoDayShippingEligible) {
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
    }

}
