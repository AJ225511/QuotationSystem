package wiese.factory;

import wiese.domain.ResponseObj;

public class ResponseObjFactory {

    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription) {
        return new ResponseObj(responseCode, responseDescription);
    }
}