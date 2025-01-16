package oops;

class PBook {
    //runtime poly or methor overriding
    void book_Det() {
        System.out.println("Python Book Details");
        System.out.println("------------------");
    }
}


class JBook {
    //compiletime poly or method overloading
    void book_Det() {
        System.out.println("Java Book Details");
        System.out.println("------------------");
    }

    void book_Det(int brate) {
        System.out.println("Book Rate : " + brate);
    }

    void book_Det(String auth) {
        System.out.println("Author Name  : " + auth);
    }


}

public class PolyExa {
    public static void main(String[] args) {
        JBook jb = new JBook();
        jb.book_Det();
        jb.book_Det(450);
    }
}


//Polymorphism
//
//------------
//
//one can Have Many Forms
//
//CompileTimePoly or Method Over Loading
//
//--------------------------------------
//
//function names are same
//
//arguments are diff
//
//within same class
//
//RunTimePoly or Method Overriding
//
//--------------------------------------
//
//function names are same
//
//arguments are also Same
//
//diff class