package Customs;

public class Decode {

    public static String transection_PaymentType(String paymentType){
        if(paymentType.equals(Values.Transection.paymentTypeCash)) return Values.Transection.decodePaymentTypeCash;
        else if(paymentType.equals(Values.Transection.paymentTypeCheck)) return Values.Transection.decodePaymentTypeCheck;
        else if(paymentType.equals(Values.Transection.paymentTypeOnline)) return Values.Transection.decodePaymentTypeOnline;
        else if(paymentType.equals(Values.Transection.paymentTypeCreditCard)) return Values.Transection.decodePaymentTypeCreditCard;
        return paymentType;
    }

    public static String transection_VoucherType(String voucharType){
        if(voucharType.equals(Values.Transection.voucherTypeRegular)) return Values.Transection.decodeVoucherTypeRegular;
        else if(voucharType.equals(Values.Transection.voucherTypeReturn)) return Values.Transection.decodeVoucherTypeReturn;
        else if(voucharType.equals(Values.Transection.voucherTypeReceipt)) return Values.Transection.decodeVoucherTypeReceipt;
        else if(voucharType.equals(Values.Transection.voucherTypeSale)) return Values.Transection.decodeVoucherTypeSale;
        else if(voucharType.equals(Values.Transection.voucherTypeDeadStock)) return Values.Transection.decodeVoucherTypeDeadStock;
        else if(voucharType.equals(Values.Transection.voucherTypeGodownToGodown)) return Values.Transection.decodeVoucherTypeGodownToGodown;
        else if(voucharType.equals(Values.Transection.voucherTypeGodownIn)) return Values.Transection.decodeVoucherTypeGodownIn;
        return voucharType;
    }


    public static String transection_Status(String status){
        if(status.equals(Values.Transection.statusClear)) return Values.Transection.decodeStatusClear;
        else if(status.equals(Values.Transection.statusPending)) return Values.Transection.decodeStatusPending;
        return status;
    }

    public static String customerType(String type){
        if(type.equals(Values.Customer.CustomerType)) return Values.Customer.decodeCustomerType;
        else if(type.equals(Values.Customer.SupplierType)) return Values.Customer.decodeSupplierType;
        return type;
    }


}
