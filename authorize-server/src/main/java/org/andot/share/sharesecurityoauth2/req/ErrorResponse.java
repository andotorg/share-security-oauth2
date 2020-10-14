package org.andot.share.sharesecurityoauth2.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse extends Response {
    private Integer errorCode;
    private Integer errorMsg;
}
