package chapter_12;

public class ExceptionClass {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.speak(1200);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

class Student {
    public void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException("参数不能大于 1000");
        }
    }
}