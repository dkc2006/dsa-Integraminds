package day_2.oops;

interface Color {
    void red();
    void blue();
}

interface Animal {
    void lion();
    void tiger();
}

interface Bird {
    void eagle();
    void peacock();
}

class Colors implements Color {
    public void red() {
        System.out.println("Red is Attractive Color");
    }

    public void blue() {
        System.out.println("Blue is My Fav Color");
    }
}

class Animals implements Animal {
    public void lion() {
        System.out.println("Lion is King Of Forest");
    }

    public void tiger() {
        System.out.println("Tiger is Our National Animal");
    }
}

class Birds implements Bird {
    public void eagle() {
        System.out.println("Eagle is King Of Birds");
    }

    public void peacock() {
        System.out.println("Peacock is Our National Bird");
    }
}

class InheritanceExa implements Color, Animal, Bird {
    public static void main(String[] args) {
        InheritanceExa bb = new InheritanceExa();
        bb.eagle();
        bb.peacock();
        bb.lion();
        bb.tiger();
        bb.red();
        bb.blue();
    }

    // Implementing methods from Color interface
    public void red() {
        System.out.println("Red is Attractive Color");
    }

    public void blue() {
        System.out.println("Blue is My Fav Color");
    }

    // Implementing methods from Animal interface
    public void lion() {
        System.out.println("Lion is King Of Forest");
    }

    public void tiger() {
        System.out.println("Tiger is Our National Animal");
    }

    // Implementing methods from Bird interface
    public void eagle() {
        System.out.println("Eagle is King Of Birds");
    }

    public void peacock() {
        System.out.println("Peacock is Our National Bird");
    }
}
