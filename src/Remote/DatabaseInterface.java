package Remote;

import BeanClass.*;
import javax.swing.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public interface DatabaseInterface extends Remote {


    public String getRootDirPath()throws SQLException, RemoteException;

    /////////////////********************* IMAGES ********************************//////////////////
    public void insertImage(String parentFolder, String id, String fileName, ImageIcon imageIcon)throws Exception;
    public ArrayList getImage(String parentFolder, String id)throws Exception;
    /////////////////********************* IMAGES ********************************//////////////////


    /////////////////********************* GODOWN TABLE ********************************//////////////////
    ////////////////********************* INSERT
    public int insertGodown(String godownName)throws SQLException, RemoteException;
    ////////////////********************* UPDATE
    public int updateGodown(GodownBean bean)throws SQLException, RemoteException;
    ////////////////********************* GET ALL
    public ArrayList getGodown()throws SQLException, RemoteException;
    ////////////////********************* GET BY GODOWN ID
    public ArrayList getGodownByGodownId(Integer godownId)throws SQLException, RemoteException;
    ////////////////********************* GET BY GODOWN NAME
    public ArrayList getGodownByGodownName(String godownName)throws SQLException, RemoteException;

    ////////////////****BEAN
    ////////////////********************* GET BEAN BY GODOWN ID
    public GodownBean getGodownBeanByGodownId(Integer godownId)throws SQLException, RemoteException;
    /////////////////********************* GODOWN TABLE ********************************//////////////////







    /////////////////********************* CITY TABLE ********************************//////////////////
    /////////////////********************* INSERT
    public int insertCity(String cityName)throws SQLException, RemoteException;
    /////////////////********************* INSERT GET GENARATED ID
    public int insertCityGetId(String cityName)throws SQLException, RemoteException;
    /////////////////********************* UPDATE
    public int updateCity(int cityId, String cityName)throws SQLException, RemoteException;
    /////////////////********************* DELETE
    public int deleteCity(int cityId)throws SQLException, RemoteException;
    /////////////////********************* GET
    public ArrayList getCity()throws SQLException, RemoteException;
    /////////////////********************* OVERIDE GET
    public CityBean getCity(int cityId)throws SQLException, RemoteException;
    /////////////////********************* OVERIDE GET
    public CityBean getCity(String cityName)throws SQLException, RemoteException;


    /////////////////********************* SINGLE VALUE
    /////////////////********************* GET CITY NAME BY ID
    public Integer getCityIdByCityName(String cityName)throws  SQLException, RemoteException;
    /////////////////********************* CITY TABLE ********************************//////////////////






    /////////////////********************* UNIT TABLE ********************************//////////////////
    ////////////////********************* INSERT
    public int insertUnit(String unitName)throws SQLException, RemoteException;
    ////////////////********************* UPDATE
    public int updateUnit(UnitBean bean)throws SQLException, RemoteException;
    ////////////////********************* GET ALL
    public ArrayList getUnit()throws SQLException, RemoteException;

    ////////////////********************* BEAN
    ////////////////********************* GET BY UNIT ID
    public UnitBean getUnitBeanById(int unitId)throws SQLException, RemoteException;
    ////////////////********************* GET BY UNIT NAME
    public UnitBean getUnitBeanByName(String unitName)throws SQLException, RemoteException;


    ////////////////********************* SINGLE VALUE
    /////////////////********************* GET UNIT ID BY NAME
    public Integer getUnitIdByName(String unitName) throws  SQLException, RemoteException;
    ////////////////********************* GET UNIT AS STRING
    public ArrayList<String> getUnitAsString() throws  SQLException, RemoteException;
    /////////////////********************* UNIT TABLE ********************************//////////////////







    ////////////////********************* CUSTOMERS METHODS ********************************//////////////////
    ////////////////********************* INSERT
    public int insertCustomer(CustomersBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT GET GENERATED ID
    public int insertCustomerGetId(CustomersBean bean)throws SQLException, RemoteException;

    ////////////////********************* UPDATE
    public int updateCustomer(CustomersBean bean)throws SQLException, RemoteException;
    ////////////////********************* UPDATE BALANCE
    public int updateCustomerOpeningBalance(Integer customerId, Float openingBalance)throws SQLException, RemoteException;

    ////////////////********************* GET ALL
    public ArrayList getCustomer()throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER TYPE
    public ArrayList getCustomerByCustomerType(String customerType)throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER ID
    public ArrayList getCustomerByCustomerId(Integer customerId)throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER NAME & TYPE
    public ArrayList getCustomerByFirmNameAndType(String firmName, String customerType)throws SQLException, RemoteException;
    ////////////////********************* GET BY CITY NAME
    public ArrayList getCustomerByCityName(String cityName)throws SQLException, RemoteException;
    ////////////////********************* GET BY CITY NAME & TYPE
    public ArrayList getCustomerByCityNameAndType(String cityName, String customerType)throws SQLException, RemoteException;

    ////////////////********************* FILTER SEARCH
    public ArrayList getCustomerByFilterSearch(CustomersBean bean)throws SQLException, RemoteException;


    ////////////////********************* BEAN
    ////////////////********************* GET CUSTOMER BEAN BY CUSTOMER ID
    public CustomersBean getCustomerBeanByCustomerId(Integer customerId)throws SQLException, RemoteException;

    ////////////////********************* SINGLE VALUE
    ////////////////********************* GET CUSTOMER TYPE BY TRANSECTION ID
    public String getCustomerTypeByTransectionId(Integer transectionId) throws SQLException, RemoteException;


    ////////////////********************* JOINING
    ////////////////********************* GET CUSTOMER/SUPPLIER BY CUSTOMER TYPE & PRODUCT ID
    public ArrayList getCustomerJoiningByCustomerTypeAndProductId(String customerType, Integer productId)throws SQLException, RemoteException;
    ////////////////********************* CUSTOMERS METHODS ********************************//////////////////






    ////////////////********************* CONTACT METHODS ********************************//////////////////
    ////////////////********************* INSERT
    public int insertContact(ContactBean bean)throws SQLException, RemoteException;
    ////////////////********************* GET BY CONTACT TYPE
    public ArrayList getContactByCustomerId(int customerId)throws SQLException, RemoteException;
    ////////////////********************* UPDATE
    public int updateContact(ContactBean bean)throws SQLException, RemoteException;
    ////////////////********************* CONTACT METHODS ********************************//////////////////






    ////////////////********************* PRODUCT CATEGORY METHODS ********************************//////////////////
    ////////////////********************* INSERT
    public int insertProductCategory(ProductCategoryBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT GET GENERATED ID
    public int insertProductGetId(ProductsBean bean)throws SQLException, RemoteException;
    ////////////////********************* UPDATE
    public int updateProductCategory(ProductCategoryBean bean)throws SQLException, RemoteException;
    ////////////////********************* GET ALL
    public ArrayList getProductCategory()throws SQLException, RemoteException;
    ////////////////********************* GET BY PROD CAT ID
    public ArrayList getProductCategoryByProdCatId(Integer prodCatId)throws SQLException, RemoteException;
    ////////////////********************* GET BY PROD CAT NAME
    public ArrayList getProductCategoryByProdCatName(String prodCatName)throws SQLException, RemoteException;
    /////////////////********************* GET PRODUCT CATEGORY AS STRING
    public ArrayList<String> getProductCategoryAsString() throws  SQLException, RemoteException;


    ////////////////********************* BEAN
    ////////////////********************* GET BEAN BY PRODUCT CATEGORY ID
    public ProductCategoryBean getProductCategoryBeanByProdCatId(Integer prodCatId)throws SQLException, RemoteException;
    ////////////////********************* GET BEAN BY PRODUCT CATEGORY NAME
    public ProductCategoryBean getProductCategoryBeanByProdCatName(String prodCatName)throws SQLException, RemoteException;


    ////////////////********************* SINGLE VALUE
    /////////////////********************* GET PRODUCT CATEGORY ID BY CAT NAME
    public Integer getProductCategoryIdByName(String prodCatName) throws  SQLException, RemoteException;
    ////////////////********************* PRODUCT CATEGORY METHODS ********************************//////////////////








    ////////////////********************* PRODUCTS METHODS ********************************//////////////////
    ////////////////********************* INSERT BY PRODUCT ID
    public int insertProductById(ProductsBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT
    public int insertProduct(ProductsBean bean)throws SQLException, RemoteException;
    ////////////////********************* UPDATE
    public int updateProduct(ProductsBean bean)throws SQLException, RemoteException;
    ////////////////********************* UPDATE OPENING ON HAND QTY
    public int updateProductOpeningOnHandQty(Integer productId, Float openingOnHandQty)throws SQLException, RemoteException;
    ////////////////********************* UPDATE CODDING FORM
    public int updateProductCoddingForm(ProductsBean bean)throws SQLException, RemoteException;
    ////////////////********************* UPDATE FAST CODDING FORM      update sale_rate, last_prod_update, update_by
    public int updateProductCoddingFastCoding(ProductsBean bean)throws SQLException, RemoteException;


    ////////////////********************* GET ALL
    public ArrayList getProducts()throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT ID
    public ArrayList getProductsByProductId(Integer productId)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT CATEGORY ID
    public ArrayList getProductsByProdCatId(Integer prodCatId)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT CATEGORY NAME
    public ArrayList getProductsByProdCatName(String prodCatName)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT NAME
    public ArrayList getProductsByProductName(String prodName)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT BRAND NAME
    public ArrayList getProductsByBrandName(String brandNmae)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT NAME AND CATEGORY ID
    public ArrayList getProductsByProductNameAndProdCatId(String prodName, Integer prodCatId)throws SQLException, RemoteException;
    ////////////////********************* GET BY PRODUCT BRAND NAME AND CATEGORY ID
    public ArrayList getProductsByBrandNameAndProdCatId(String brandName, Integer prodCatId)throws SQLException, RemoteException;


    ////////////////********************* GET TRANSECTION INQUIRY STOCK
    public ArrayList getProductSearch(ProductsBean bean) throws SQLException, RemoteException;


    ////////////////********************* BEAN
    ////////////////********************* GET PRODUCT BEAN BY ID
    public ProductsBean getProductBeanByProductId(Integer productId)throws SQLException, RemoteException;


    ////////////////********************* JOINING VALUES

    ////////////////********************* GET PRODUCT IN GODOWN WITH CATEGORY
    /***
     *  product IN (all product in godown = ? and prod_cat_id = ?) and prod_cat_id = ?
     *  -> Show all Product that exit in selected godown with selected product category
     * ***/
    public ArrayList getProductsINGodownWithCatId(Integer godownId, Integer prodCatId)throws SQLException, RemoteException;

    ////////////////********************* GET PRODUCT NOT IN GODOWN WITH CATEGORY
    /***
     *  product NOT IN (all product in godown = ? and prod_cat_id = ?) and prod_cat_id = ?
     *  -> Show all Product that NOT exit in selected godown with selected product category
     * ***/
    public ArrayList getProductsNOTInGodownWithCatId(Integer godownId, Integer prodCatId)throws SQLException, RemoteException;

    ////////////////********************* GET PRODUCT SEARCH
    public ArrayList getProductSearch(ProductsBean bean, Integer godownId) throws SQLException, RemoteException;
    ////////////////********************* GET BY GODOWN ID
    public ArrayList getProductsByGodownId(Integer godownId)throws SQLException, RemoteException;
    ////////////////********************* GET BY GODOWN ID AND PRODUCT ID
    public ArrayList getProductsByGodownIdAndProductId(Integer godownId, Integer productId)throws SQLException, RemoteException;
    ////////////////********************* GET BY GODOWN ID AND PRODUCT NAME
    public ArrayList getProductsByGodownIdAndProductName(Integer godownId, String productName)throws SQLException, RemoteException;


    ////////////////********************* SINGLE VALUE
    ////////////////********************* GET PRODUCT NAME BY PRODUCT ID
    public String getProductNameByProductId(Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT UNIT NAME BY PRODUCT ID
    public String getProductUnitNameByProductId(Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT BUYING RATE BY PRODUCT ID
    public Float getProductBuyingRateByProductId(Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT ALL QUANTITY BY CUSTOMER TYPE & PRODUCT ID
    public Float getProductAllQuantityByCustomerTypeAndProductId(String customerType, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT ALL QUANTITY BY VOUCHAR TYPE & PRODUCT ID
    public Float getProductAllQuantityByVoucharTypeAndProductId(String voucharType, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT ALL QUANTITY BY CUSTOMER TYPE & VOUCHAR TYPE & PRODUCT ID
    public Float getProductAllQuantityByCustomerTypeAndVoucharTypeAndProductId(String customerType, String voucharType, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT AVAILABLE QUANTITY BY PRODUCT ID
    public Float getProductAllAvailableQuantityByProductId(Integer productId) throws SQLException, RemoteException;


    ////////////////********************* WITH GODOWN ID
    ////////////////********************* GET PRODUCT ALL QUANTITY BY CUSTOMER TYPE & GODOWN ID & PRODUCT ID
    public Float getProductQuantityByCustomerTypeAndGodownIdAndProductId(String customerType, Integer godownId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT QUANTITY BY VOUCHAR TYPE & GODOWN ID & PRODUCT ID
    public Float getProductQuantityByVoucharTypeAndGodownIdAndProductId(String voucharType, Integer godownId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT QUANTITY BY CUSTOMER TYPE & VOUCHAR TYPE & GODOWN ID & PRODUCT ID
    public Float getProductQuantityByCustomerTypeAndVoucharTypeAndGodownIdAndProductId(String customerType, String voucharType, Integer godownId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* GET PRODUCT AVAILABLE QUANTITY BY GODOWN ID & PRODUCT ID
    public Float getProductAvailableQuantityByGodownIdAndProductId(Integer godownId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* PRODUCTS METHODS ********************************//////////////////






    ////////////////********************* TRANSECTION METHODS ********************************//////////////////
    ////////////////********************* INSERT BILL AND GET GENERATED ID
    public Integer insertTransectionBillGetId(TransectionBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT RECEIPT AND GET GENERATED ID
    public Integer insertTransectionReceiptGetId(TransectionBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT DEAD STOCK AND GET GENERATED ID
    public Integer insertTransectionDeadStockGetId(TransectionBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT GODOWN TO GODOWN AND GET GENERATED ID
    public Integer insertTransectionGodownToGodownAndGetId(TransectionBean bean)throws SQLException, RemoteException;
    ////////////////********************* INSERT GODOWN IN AND GET GENERATED ID
    public Integer insertTransectionGodownInAndGetId(TransectionBean bean)throws SQLException, RemoteException;


    ////////////////********************* UPDATE RECEIPT
    public Integer updateTransectionReceipt(Integer transectionId, String status, String remarks)throws SQLException, RemoteException;
    ////////////////********************* UPDATE TRANSECTION STOCK
    public Integer updateTransectionStock(Integer transectionId, Boolean hasBill)throws SQLException, RemoteException;
    ////////////////********************* UPDATE TRANSECTION SALE
    public Integer updateTransectionSale(Integer transectionId, String name, Float packingExpence, Float otherExpence, Float dicount, Float totalAmount)throws SQLException, RemoteException;
    ////////////////********************* UPDATE TRANSECTION GODOWN IN
    public Integer updateTransectionGodownIn(Integer transectionId, String status, String transportName, String confirmedBy, String remarks)throws SQLException, RemoteException;

    ////////////////********************* DELETE TRANSECTION
    public Integer deleteTransection(Integer transectionId)throws SQLException, RemoteException;

    ////////////////********************* GET ALL
    public ArrayList getTransection() throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER ID
    public ArrayList getTransectionByCustomerId(Integer customerId) throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER ID AND FROM DATE , TO DATE
    public ArrayList getTransectionByCustomerIdAndFromDateToDate(Integer customerId, Timestamp fromDate, Timestamp toDate) throws SQLException, RemoteException;
    ////////////////********************* GET BY CUSTOMER ID AND DATE
    public ArrayList getTransectionByCustomerIdAndDate(Integer customerId, Timestamp date) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT
    public ArrayList getTransectionReceipt() throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY STATUS
    public ArrayList getTransectionReceiptByStatus(String status) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY PAYMENT TYPE
    public ArrayList getTransectionReceiptByPaymentType(String paymentType) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY STATUS & PAYMENT TYPE
    public ArrayList getTransectionReceiptByStatusAndPaymentType(String status, String paymentType) throws SQLException, RemoteException;


    ////////////////********************* GET TRANSECTION RECEIPT & CUSTOMER ID
    public ArrayList getTransectionReceiptByCustomerId(Integer customerId) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY STATUS & CUSTOMER ID
    public ArrayList getTransectionReceiptByStatusAndCustomerId(String status, Integer customerId) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY PAYMENT TYPE & CUSTOMER ID
    public ArrayList getTransectionReceiptByPaymentTypeAndCustomerId(String paymentType, Integer customerId) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION RECEIPT BY STATUS & PAYMENT TYPE & CUSTOMER ID
    public ArrayList getTransectionReceiptByStatusAndPaymentTypeAndCustomerId(String status, String paymentType, Integer customerId) throws SQLException, RemoteException;

    ////////////////********************* GET TRANSECTION INQUIRY STOCK
    public ArrayList getTransectionInquiryStock(TransectionBean bean, Boolean hasBill) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION INQUIRY SALE
    public ArrayList getTransectionInquirySale(TransectionBean bean) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION INQUIRY
    public ArrayList getTransectionInquiry(TransectionBean bean) throws SQLException, RemoteException;
    ////////////////********************* GET TRANSECTION INQUIRY GODOWN
    public ArrayList getTransectionInquiryGodown(TransectionBean bean) throws SQLException, RemoteException;

    ////////////////********************* BEAN
    ////////////////********************* GET TRANSECTION BEAN BY TRANSECTION ID
    public TransectionBean getTransectionBeanByTransectionId(Integer transectionId) throws SQLException, RemoteException;

    ////////////////********************* JOINING
    ////////////////********************* GET TRANSECTION BY CUSTOMER ID & PRODUCT ID
    public ArrayList getTransectionJoiningByCustomerIdAndProductId(Integer customerId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* TRANSECTION METHODS ********************************//////////////////




    ////////////////********************* PRODUCT TRANSECTION METHODS ********************************//////////////////
    ////////////////********************* INSERT
    public int insertProductTransection(ProductTransectionBean bean)throws SQLException, RemoteException;
    ////////////////********************* DELETE PRODUCT TRANSECTION BY TRANSECTION ID
    public Integer deleteProductTransection(Integer transectionId)throws SQLException, RemoteException;

    ////////////////********************* GET PRODUCT TRANSECTION BY TRANSECTION ID
    public ArrayList getProductTransectionByTransectionId(Integer transectionId) throws SQLException, RemoteException;
    ////////////////********************* PRODUCT TRANSECTION METHODS ********************************//////////////////




    ////////////////********************* DETERMINATION METHODS ********************************//////////////////
    ////////////////********************* INSERT
    public int insertDetermination(DeterminationBean bean)throws SQLException, RemoteException;
    ////////////////********************* DELETE DETERMINATION BY TRANSECTION ID
    public Integer deleteDetermination(Integer transectionId)throws SQLException, RemoteException;

    ////////////////********************* GET DETERMINATION BY TRANSECTION ID
    public ArrayList getDeterminationByTransectionIdAndProductId(Integer transectionId, Integer productId) throws SQLException, RemoteException;
    ////////////////********************* DETERMINATION METHODS ********************************//////////////////


}
