/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_trycatch;

/**
 *
 * @author langk
 */
public class AgeCheckingException extends Exception {
//    Custom Exception này sẽ kế thừa từ lớp Exception
    // đây là contructor
    public AgeCheckingException(String message) {
    super(message); //truyền message này cho lớp cha thông qua lời gọi super()
    }
    
//phương thức getMessage() để trả về nhiều thông tin
    @Override
    public String getMessage() {
    return "Lỗi nhập vào một tuổi: " + super.getMessage();
    }
}
