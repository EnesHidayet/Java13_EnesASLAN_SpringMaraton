package org.enes.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    INTERNAL_ERROR(1000,"Sunucuda beklenmeyen hata oluştu, lütfen tekrar denetiniz.",HttpStatus.INTERNAL_SERVER_ERROR),

    ERROR_DUPLICATE_TCKIMLIK(2000,"Bu tc kimlikli hasta zaten kayıtlı.Lütfen değiştirerek tekrar deneyiniz.",HttpStatus.BAD_REQUEST),

    BAD_REQUEST_ERROR(1001,"Girilen parametreler hatalıdır.Lütfen düzelterek tekrar deneyiniz.",HttpStatus.BAD_REQUEST),

    ERROR_INVALID_PARAMETER_HASTA(2001,"Bu id ye sahip bir hasta bulunamamıştır.Lütfen tekrar deneyiniz.",HttpStatus.BAD_REQUEST),

    ERROR_INVALID_PARAMETER_DOKTOR(2002,"Bu id ye sahip bir doktor bulunamamıştır.Lütfen tekrar deneyiniz.",HttpStatus.BAD_REQUEST),

    ERROR_INVALID_PARAMETER_RANDEVU(2003,"Bu id ye sahip bir randevu bulunamamıştır.Lütfen tekrar deneyiniz.",HttpStatus.BAD_REQUEST),

    ERROR_INVALID_TC_KIMLIK(2004,"Bu tc numaralı hasta bulunamamıştır.",HttpStatus.BAD_REQUEST),

    ERROR_INVALID_TC_KIMLIK_SAVE(2005,"Bu tc numaralı hasta bulunamamıştır.Randevu alabilmek için önce hasta kaydı yapılmalıdır.",HttpStatus.BAD_REQUEST);



    int code;
    String message;
    HttpStatus httpStatus;
}
