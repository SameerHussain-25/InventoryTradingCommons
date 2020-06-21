package Customs;

public class Encode {


    public static String transection_PaymentType(String paymentType){
        if(paymentType.equals(Values.Transection.decodePaymentTypeCash)) return Values.Transection.paymentTypeCash;
        else if(paymentType.equals(Values.Transection.decodePaymentTypeCheck)) return Values.Transection.paymentTypeCheck;
        else if(paymentType.equals(Values.Transection.decodePaymentTypeOnline)) return Values.Transection.paymentTypeOnline;
        else if(paymentType.equals(Values.Transection.decodePaymentTypeCreditCard)) return Values.Transection.paymentTypeCreditCard;
        return paymentType;
    }

    public static String transection_VoucherType(String voucharType){
        if(voucharType.equals(Values.Transection.decodeVoucherTypeRegular)) return Values.Transection.voucherTypeRegular;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeReturn)) return Values.Transection.voucherTypeReturn;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeReceipt)) return Values.Transection.voucherTypeReceipt;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeSale)) return Values.Transection.voucherTypeSale;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeDeadStock)) return Values.Transection.voucherTypeDeadStock;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeGodownToGodown)) return Values.Transection.voucherTypeGodownToGodown;
        else if(voucharType.equals(Values.Transection.decodeVoucherTypeGodownIn)) return Values.Transection.voucherTypeGodownIn;
        return voucharType;
    }

    public static String transection_Status(String voucharType){
        if(voucharType.equals(Values.Transection.decodeStatusClear)) return Values.Transection.statusClear;
        else if(voucharType.equals(Values.Transection.decodeStatusPending)) return Values.Transection.statusPending;
        return voucharType;
    }


    public static String customerType(String type){
        if(type.equals(Values.Customer.decodeCustomerType)) return Values.Customer.CustomerType;
        else if(type.equals(Values.Customer.decodeSupplierType)) return Values.Customer.SupplierType;
        return type;
    }


    public static String usersPrivileges(String privileges){
        if(privileges.equals(Values.User.decodePrivilgeAdmin)) return Values.User.privilgeAdmin;
        else if(privileges.equals(Values.User.decodePrivilgeTechnicalUser)) return Values.User.privilgeTechnicalUser;
        else if(privileges.equals(Values.User.decodePrivilgeComputerOperator)) return Values.User.privilgeComputerOperator;
        else if(privileges.equals(Values.User.decodePrivilgeOtherUser)) return Values.User.privilgeOtherUser;
        return privileges;
    }


}
