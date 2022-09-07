
package Enum;

public enum Palo {
    ESPADA ("Espada"), BASTO ("Basto"), ORO ("Oro"), COPA ("Copa");
    private String palo;

    private Palo() {
    }

    private Palo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return palo ;
    }
    
}
 