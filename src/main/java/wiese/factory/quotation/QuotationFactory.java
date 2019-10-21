package wiese.factory.quotation;

import wiese.domain.quotation.Quotation;

public class QuotationFactory {

    public static Quotation buildQuotation(String quotationId, String productId, String orderId, String clientId, String employeeId){
        return new Quotation(quotationId,productId,orderId,clientId,employeeId);
    }
}
