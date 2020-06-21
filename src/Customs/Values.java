package Customs;

import java.util.Hashtable;

final public class Values {

    final public static Hashtable getTableMap(){
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(User.tableName, User.tableCodeName);
        hashtable.put(City.tableName, City.tableCodeName);
        hashtable.put(Godown.tableName, Godown.tableCodeName);
        hashtable.put(Unit.tableName, Unit.tableCodeName);
        hashtable.put(Customer.tableName, Customer.tableCodeName);
        hashtable.put(Contact.tableName, Contact.tableCodeName);
        hashtable.put(ProductCategory.tableName, ProductCategory.tableCodeName);
        hashtable.put(Products.tableName, Products.tableCodeName);
        hashtable.put(Transection.tableName, Transection.tableCodeName);
        hashtable.put(ProductTransection.tableName, ProductTransection.tableCodeName);
        hashtable.put(Determination.tableName, Determination.tableCodeName);
        return hashtable;
    }

    //// DATABASE TABLE NAMES
    final public static String[] tableNames = {
            User.tableName,
            City.tableName,
            Godown.tableName,
            Unit.tableName,
            Customer.tableName,
            Contact.tableName,
            ProductCategory.tableName,
            Products.tableName,
            Transection.tableName,
            ProductTransection.tableName,
            Determination.tableName
    };

    //// USER TABLE
    final public static class User {
        final public static String tableName = "users";
        final public static String tableCodeName = "9767897875";

        ////**** PRIVILEGES
        final public static String privilgeAdmin = "AD";                                    // ADMIN
        final public static String privilgeTechnicalUser = "TD";                            // TECHNICAL USER
        final public static String privilgeComputerOperator = "CO";                         // COMPUTER OPERATOR
        final public static String privilgeOtherUser = "OU";                                // OTHER USER

        final public static String decodePrivilgeAdmin = "Admin";                           // ADMIN
        final public static String decodePrivilgeTechnicalUser = "Technical User";          // TECHNICAL USER
        final public static String decodePrivilgeComputerOperator = "Computer Operator";    // COMPUTER OPERATOR
        final public static String decodePrivilgeOtherUser = "Other User";                  // OTHER USER
    }

    //// CITY TABLE
    final public static class City {
        final public static String tableName = "city";
        final public static String tableCodeName = "976786875";
    }

    //// GODOWN TABLE
    final public static class Godown{
        final public static String tableName = "godown";
        final public static String tableCodeName = "906786875";

        final public static String searchByGodownId = "Godown ID";
        final public static String searchByGodownName = "Godown Name";
    }

    //// UNIT TABLE
    final public static class Unit {
        final public static String tableName = "unit";
        final public static String tableCodeName = "986716875";

    }

    //// CUSTOMER TABLE
    final public static class Customer{
        final public static String tableName = "customers";
        final public static String tableCodeName = "306716875";

        final public static String SupplierTitle = "Supplier Customer";
        final public static String CustomerTitle = "Customer Customer";
        final public static String SupplierType = "S";
        final public static String CustomerType = "C";
        final public static String decodeSupplierType = "Supplier";
        final public static String decodeCustomerType = "Customer";

        final public static String[] searchTypes = {"All", "Customer Id", "Customer Name", "City"};
        final public static String searchTypesAll = "All";
        final public static String searchTypesCustId = "Customer Id";
        final public static String searchTypesCustName = "Customer Name";
        final public static String searchTypesCustCity = "City";
    }

    //// CONTACT TABLE
    final public static class Contact{
        final public static String tableName = "contact";
        final public static String tableCodeName = "406716870";

        final public static String SupplierTitle = "Supplier Contact";
        final public static String CustomerTitle = "Customer Contact";
    }

    //// PRODUCT CATEGORY TABLE
    final public static class ProductCategory{
        final public static String tableName = "product_category";
        final public static String tableCodeName = "706716875";

        final public static String[] searchTypes = {"All", "Category Id", "Category Name"};
        final public static String searchTypesAll = "All";
        final public static String searchTypesCatId = "Category Id";
        final public static String searchTypesCatName = "Category Name";
    }

    //// PRODUCT TABLE
    final public static class Products{
        final public static String tableName = "products";
        final public static String tableCodeName = "15606875";

        final public static String colProductId = "product_id";
        final public static String colProdCatId = "prod_cat_id";
        final public static String colProdName = "prod_name";
        final public static String colProdBrandName = "prod_brand_name";
        final public static String colOpeningRate = "opening_rate";
        final public static String colBuyingRate = "buying_rate";
        final public static String colSaleRate = "sale_rate";
        final public static String colOpeningOnHandQty = "opening_onhand_qty";
        final public static String colProdCreateDate = "prod_create_date";
        final public static String colLastProdUpdate = "last_prod_update";
        final public static String colUpdateBy = "update_by";
        final public static String colUnitId = "unit_id";
        final public static String colRemarks = "remarks";

        final public static String searchByProductId = "Product ID";
        final public static String searchByProdCatName = "Product Category";
        final public static String searchByProdName = "Product Name";
        final public static String searchByProdBrandName = "Brand Name";
        final public static String searchByProdPrice = "Price";
    }

    //// TRANSECTION TABLE
    final public static class Transection{
        final public static String tableName = "transection";
        final public static String tableCodeName = "946716123";

        ////**** VOUCHER TYPE
        final public static String decodeVoucherTypeRegular = "Regular";                    // REGULAR
        final public static String decodeVoucherTypeReturn = "Return";                      // RETURN
        final public static String decodeVoucherTypeReceipt = "Receipt";                    // RECEIPT
        final public static String decodeVoucherTypeSale = "Sale";                          // RECEIPT
        final public static String decodeVoucherTypeDeadStock = "Dead Stock";               // DEAD STOCK
        final public static String decodeVoucherTypeGodownToGodown = "Godown To Godown";    // GODWON TO GODOWN
        final public static String decodeVoucherTypeGodownIn = "Godown In";                 // GODWON IN

        final public static String voucherTypeRegular = "REG";                  // REGULAR
        final public static String voucherTypeReturn = "RTN";                   // RETURN
        final public static String voucherTypeReceipt = "RPT";                  // RECEIPT
        final public static String voucherTypeSale = "SLE";                     // RECEIPT
        final public static String voucherTypeDeadStock = "DSK";                // DEAD STOCK
        final public static String voucherTypeGodownToGodown = "GTG";           // GODWON TO GODOWN
        final public static String voucherTypeGodownIn = "GIN";                 // GODWON IN

        ////**** STATUS
        final public static String statusClear = "C";                           // CLEAR
        final public static String statusPending = "P";                         // PENDING

        final public static String decodeStatusClear = "Clear";                 // CLEAR
        final public static String decodeStatusPending = "Pending";             // PENDING

        ////**** PAYMENT TYPE
        final public static String decodePaymentTypeCash = "Cash";              // CASH
        final public static String decodePaymentTypeCheck = "Check";            // CHECK
        final public static String decodePaymentTypeOnline = "Online";          // ONLINE
        final public static String decodePaymentTypeCreditCard = "Credit Card"; // CREDIT CARD

        final public static String paymentTypeCash = "CA";                      // CASH
        final public static String paymentTypeCheck = "CH";                     // CHECK
        final public static String paymentTypeOnline = "ON";                    // ONLINE
        final public static String paymentTypeCreditCard = "CC";                // CREDIT CARD

        ////**** SEARCH BY
        final public static String searchByNone = "None";                           // NONE
        final public static String searchByTid = "TID";                             // TID
        final public static String searchByDate = "Date";                           // DATE
        final public static String searchByName = "Name";                           // NAME
        final public static String searchByFromGodownId = "From Godown ID";         // FROM GODOWN ID
        final public static String searchByToGodownId = "To Godown ID";             // TO GODOWN ID
        final public static String searchByStatus = "Status";                       // STATUS
        final public static String searchByReferenceBillNo = "Reference Bill No";   // REFERENCE BILL NO
        final public static String searchByTransportName = "Transport Name";        // TRANSPORT NAME
        final public static String searchByPackingExpence = "Packing Expence";      // PACKING EXPENCE
        final public static String searchByOtherExpence = "Other Expence";          // OTHER EXPENCE
        final public static String searchByDiscount = "Discount";                   // DISCOUNT
        final public static String searchByConfirmedBy = "Confirmed By";            // CONFIRMED BY
        final public static String searchByTotalAmount = "Total Amount";            // TOTAL AMOUNT
        final public static String searchByPaymentType = "Payment Type";            // PAYMENT TYPE
    }

    //// PRODUCT TRANSECTION TABLE
    final public static class ProductTransection{
        final public static String tableName = "product_transection";
        final public static String tableCodeName = "67124875";
    }

    //// DETERMINATION TABLE
    final public static class Determination{
        final public static String tableName = "determination";
        final public static String tableCodeName = "961875";
    }

    //// GET DATABASE STURCTURE QURIES
    final public static String[] getDatabaseSturctureQueries(String dbName){
        return new String[]{

                /// CREATE DATABASE
                "CREATE DATABASE `"+dbName+"`;",
                "USE `"+dbName+"`;",

                /// USER
                "DROP TABLE IF EXISTS `users`;",
                "CREATE TABLE `users` (" +
                        "  `user_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `user_name` varchar(25) NOT NULL," +
                        "  `password` varchar(12) NOT NULL," +
                        "  `privilege` varchar(2) NOT NULL," +
                        "  PRIMARY KEY (`user_id`,`user_name`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=latin1;",

                /// CITY TABLE
                "DROP TABLE IF EXISTS `city`;",
                "CREATE TABLE `city` (" +
                        "  `city_id` int(10) NOT NULL AUTO_INCREMENT," +
                        "  `city_name` varchar(50) NOT NULL," +
                        "  PRIMARY KEY (`city_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// GODOWN
                "DROP TABLE IF EXISTS `godown`;",
                "CREATE TABLE `godown` (" +
                        "  `godown_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `godown_name` varchar(30) NOT NULL," +
                        "  PRIMARY KEY (`godown_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// UNIT
                "DROP TABLE IF EXISTS `unit`;",
                "CREATE TABLE `unit` (" +
                        "  `unit_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `unit_name` varchar(10) DEFAULT NULL," +
                        "  PRIMARY KEY (`unit_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// CUSTOMER
                "DROP TABLE IF EXISTS `customers`;",
                "CREATE TABLE `customers` (" +
                        "  `customer_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `cust_name` varchar(50) NOT NULL," +
                        "  `firm_name` varchar(100) NOT NULL," +
                        "  `account_title` varchar(25) DEFAULT NULL," +
                        "  `account_number` varchar(20) DEFAULT NULL," +
                        "  `customer_type` varchar(2) NOT NULL," +
                        "  `city_id` int(11) NOT NULL," +
                        "  `address` varchar(50) NOT NULL," +
                        "  `opening_balance` float DEFAULT NULL,"+
                        "  PRIMARY KEY (`customer_id`)," +
                        "  KEY `city_id` (`city_id`)," +
                        "  KEY `customer_type_id` (`customer_type`)," +
                        "  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// CONTACT TABLE
                "DROP TABLE IF EXISTS `contact`;",
                "CREATE TABLE `contact` (" +
                        "  `contact_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `customer_id` int(11) DEFAULT NULL," +
                        "  `contact_name` varchar(15) NOT NULL," +
                        "  `phone_no` varchar(15) NOT NULL," +
                        "  `email_address` varchar(30) DEFAULT NULL," +
                        "  PRIMARY KEY (`contact_id`)," +
                        "  KEY `customer_id` (`customer_id`)," +
                        "  CONSTRAINT `contact_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// PRODUCT CATEGORY
                "DROP TABLE IF EXISTS `product_category`;",
                "CREATE TABLE `product_category` (" +
                        "  `prod_cat_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `prod_cat_name` varchar(30) DEFAULT NULL," +
                        "  `remarks` varchar(100) DEFAULT NULL," +
                        "  PRIMARY KEY (`prod_cat_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// PRODUCTS
                "DROP TABLE IF EXISTS `products`;",
                "CREATE TABLE `products` (" +
                        "  `product_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `prod_cat_id` int(11) DEFAULT NULL," +
                        "  `prod_name` varchar(100) NOT NULL," +
                        "  `prod_brand_name` varchar(50) DEFAULT NULL," +
                        "  `opening_rate` float NOT NULL," +
                        "  `buying_rate` float DEFAULT NULL," +
                        "  `sale_rate` float DEFAULT NULL," +
                        "  `opening_onhand_qty` float DEFAULT NULL," +
                        "  `prod_create_date` timestamp NULL DEFAULT NULL," +
                        "  `last_prod_update` timestamp NULL DEFAULT NULL," +
                        "  `update_by` varchar(30) DEFAULT NULL," +
                        "  `unit_id` int(11) DEFAULT NULL," +
                        "  `remarks` varchar(100) DEFAULT NULL," +
                        "  PRIMARY KEY (`product_id`)," +
                        "  KEY `prod_cat_id` (`prod_cat_id`)," +
                        "  KEY `unit_id` (`unit_id`)," +
                        "  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`prod_cat_id`) REFERENCES `product_category` (`prod_cat_id`)," +
                        "  CONSTRAINT `products_ibfk_2` FOREIGN KEY (`unit_id`) REFERENCES `unit` (`unit_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// TRANSECTION
                "DROP TABLE IF EXISTS `transection`;",
                "CREATE TABLE `transection` (" +
                        "  `transection_id` int(11) NOT NULL AUTO_INCREMENT," +
                        "  `trans_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP," +
                        "  `customer_id` int(11) DEFAULT NULL," +
                        "  `user_id` int(11) DEFAULT NULL,"+
                        "  `name` varchar(30) DEFAULT NULL," +
                        "  `from_godown_id` int(11) DEFAULT NULL," +
                        "  `to_godown_id` int(11) DEFAULT NULL," +
                        "  `voucher_type` varchar(3) NOT NULL," +
                        "  `payment_type` varchar(2) DEFAULT NULL," +
                        "  `packing_expence` float DEFAULT NULL," +
                        "  `other_expence` float DEFAULT NULL," +
                        "  `discount` float DEFAULT NULL," +
                        "  `total_amount` float DEFAULT NULL," +
                        "  `has_bill_in_hand` tinyint(1) DEFAULT NULL," +
                        "  `status` varchar(1) NOT NULL," +
                        "  `reference_bill_no` varchar(30) DEFAULT NULL," +
                        "  `transport_name` varchar(30) DEFAULT NULL," +
                        "  `remarks` varchar(100) DEFAULT NULL," +
                        "  `confirmed_by` varchar(30) DEFAULT NULL," +
                        "  PRIMARY KEY (`transection_id`)," +
                        "  KEY `customer_id` (`customer_id`)," +
                        "  CONSTRAINT `transection_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`)," +
                        "  CONSTRAINT `transection_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)" +
                        ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;",

                /// PRODUCT TRANSECTION
                "DROP TABLE IF EXISTS `product_transection`;",
                "CREATE TABLE `product_transection` (" +
                        "  `transection_id` int(11) DEFAULT NULL," +
                        "  `product_id` int(11) DEFAULT NULL," +
                        "  `godown_id` int(11) DEFAULT NULL," +
                        "  `quantity` float NOT NULL," +
                        "  `unit_price` float NOT NULL," +
                        "  `amount` float NOT NULL," +
                        "  KEY `godown_id` (`godown_id`)," +
                        "  KEY `transection_id` (`transection_id`)," +
                        "  KEY `product_id` (`product_id`)," +
                        "  CONSTRAINT `product_transection_ibfk_3` FOREIGN KEY (`godown_id`) REFERENCES `godown` (`godown_id`)," +
                        "  CONSTRAINT `product_transection_ibfk_4` FOREIGN KEY (`transection_id`) REFERENCES `transection` (`transection_id`)," +
                        "  CONSTRAINT `product_transection_ibfk_5` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=latin1;",

                /// DETERMINATION
                "DROP TABLE IF EXISTS `determination`;",
                "CREATE TABLE `determination` (" +
                        "  `transection_id` int(11) DEFAULT NULL," +
                        "  `product_id` int(11) DEFAULT NULL," +
                        "  `no_of_pack` float DEFAULT NULL," +
                        "  `quantity` float DEFAULT NULL," +
                        "  KEY `transection_id` (`transection_id`)," +
                        "  KEY `product_id` (`product_id`)," +
                        "  CONSTRAINT `determination_ibfk_1` FOREIGN KEY (`transection_id`) REFERENCES `transection` (`transection_id`)," +
                        "  CONSTRAINT `determination_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)" +
                        ") ENGINE=InnoDB DEFAULT CHARSET=latin1;"
        };
    }   //** END getDatabaseSturctureQueries()

    //// GET DATABASE STRUCTURE QURIES FOR SQLITE
    final public static String[] getSQLiteDatabaseSturctureQueries() {
        return new String[]{

                /// USER
                "CREATE TABLE users (" +
                        "  user_id INTEGER PRIMARY KEY," +
                        "  user_name TEST," +
                        "  password TEST," +
                        "  privilege TEST," +
                        "  )",

                /// CITY TABLE
                "CREATE TABLE city (" +
                        " city_id INTEGER PRIMARY KEY," +
                        " city_name TEST," +
                        " )",

                /// GODOWN
                "CREATE TABLE godown (" +
                        " godown_id INTEGER PRIMARY KEY," +
                        " godown_name TEST," +
                        " )",

                /// UNIT
                "CREATE TABLE unit (" +
                        " unit_id INTEGER PRIMARY KEY," +
                        " unit_name TEST," +
                        " )",

                /// CUSTOMER
                "CREATE TABLE customers (" +
                        " customer_id INTEGER PRIMARY KEY," +
                        " cust_name TEST NOT NULL," +
                        " firm_name TEST NOT NULL," +
                        " account_title TEST," +
                        " account_number TEST," +
                        " customer_type TEST," +
                        " city_id INTEGER," +
                        " address TEST," +
                        " opening_balance FLOAT " +
                        " )",

                /// CONTACT TABLE
                "CREATE TABLE contact (" +
                        " contact_id INTEGER PRIMARY KEY," +
                        " customer_id INTEGER," +
                        " contact_name TEST," +
                        " phone_no TEST," +
                        " email_address TEST," +
                        " )",

                /// PRODUCT CATEGORY
                "CREATE TABLE product_category (" +
                        " prod_cat_id INTEGER PRIMARY KEY," +
                        " prod_cat_name TEST," +
                        " remarks TEST," +
                        " )",

                /// PRODUCTS
                "CREATE TABLE products (" +
                        " product_id INTEGER PRIMARY KEY," +
                        " prod_cat_id INTEGER," +
                        " prod_name TEST," +
                        " prod_brand_name TEST," +
                        " opening_rate FLOAT," +
                        " buying_rate FLOAT," +
                        " sale_rate FLOAT," +
                        " opening_onhand_qty FLOAT," +
                        " prod_create_date DATETIME," +
                        " last_prod_update DATETIME," +
                        " update_by TEST," +
                        " unit_id INTEGER," +
                        " remarks TEST," +
                        " )",

                /// TRANSECTION
                "CREATE TABLE transection (" +
                        " transection_id INTEGER PRIMARY KEY," +
                        " trans_date DATETIME," +
                        " customer_id INTEGER," +
                        " user_id INTEGER,"+
                        " name TEST," +
                        " from_godown_id INTEGER," +
                        " to_godown_id INTEGER," +
                        " voucher_type TEST," +
                        " payment_type TEST," +
                        " packing_expence FLOAT," +
                        " other_expence FLOAT," +
                        " discount FLOAT," +
                        " total_amount FLOAT," +
                        " has_bill_in_hand TINYINT," +
                        " status TEST," +
                        " reference_bill_no TEST," +
                        " transport_name TEST," +
                        " remarks TEST," +
                        " confirmed_by TEST," +
                        " )",

                /// PRODUCT TRANSECTION
                "CREATE TABLE product_transection (" +
                        " transection_id INTEGER," +
                        " product_id INTEGER," +
                        " godown_id INTEGER," +
                        " quantity FLOAT," +
                        " unit_price FLOAT," +
                        " amount FLOAT," +
                        " )",

                /// DETERMINATION
                "CREATE TABLE determination (" +
                        " transection_id INTEGER," +
                        " product_id INTEGER," +
                        " no_of_pack FLOAT," +
                        " quantity FLOAT," +
                        " )"
        };
    }//** END getSQLiteDatabaseSturctureQueries()

    //// DATABASE QURIES FOR DROP TABLES SQLITE
    final public static String[] getSQLiteDropQueries(){
        return new String[]{

                /// USER
                "DROP TABLE IF EXISTS `users`;",

                /// CITY TABLE
                "DROP TABLE IF EXISTS city;",

                /// GODOWN
                "DROP TABLE IF EXISTS godown;",

                /// UNIT
                "DROP TABLE IF EXISTS unit;",

                /// CUSTOMER
                "DROP TABLE IF EXISTS customers;",

                /// CONTACT TABLE
                "DROP TABLE IF EXISTS contact;",

                /// PRODUCT CATEGORY
                "DROP TABLE IF EXISTS product_category;",

                /// PRODUCTS
                "DROP TABLE IF EXISTS products;",

                /// TRANSECTION
                "DROP TABLE IF EXISTS transection;",

                /// PRODUCT TRANSECTION
                "DROP TABLE IF EXISTS product_transection;",

                /// DETERMINATION
                "DROP TABLE IF EXISTS determination;",
        };
    }   //** END getDatabaseSturctureQueries()

}
