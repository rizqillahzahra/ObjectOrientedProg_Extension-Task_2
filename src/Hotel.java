public class Hotel {
    String Visitor;
    String TypeKamar;
    int HargaKamar;
    int DurasiInap;
    int TotalBayar;
    
    public void setVisitor(String Visitor) {
        this.Visitor = Visitor;
    }
    
    public String getVisitor() {
        return Visitor;
    }
    
    public void setTypeKamar(int Input) {
        switch (Input) {
            case 1 -> {
                this.TypeKamar = "Standard Room";
            }
            case 2 -> {
                this.TypeKamar = "Superior Room";
            }
            case 3 -> {
                this.TypeKamar = "Deluxe Room";
            }
            case 4 -> {
                this.TypeKamar = "Suite Room";
            }
            default -> {
                System.out.println("Silakan pilih type kamar Anda.");
            }
        }
    }
    
    public String getTypeKamar(int Input) {
        return TypeKamar;
    }

    public void setHargaKamar(int Input) {
        switch (Input) {
            case 1 -> {
                this.HargaKamar = 400000;
            }
            case 2 -> {
                this.HargaKamar = 500000;
            }
            case 3 -> {
                this.HargaKamar = 650000;
            }
            case 4 -> {
                this.HargaKamar = 750000;
            }
            default -> {
                this.HargaKamar = 0;
            }
        }
    }

    public int getHargaKamar(int Input) {
        switch (Input) {
            case 1 -> {
                this.HargaKamar = 400000;
            }
            case 2 -> {
                this.HargaKamar = 500000;
            }
            case 3 -> {
                this.HargaKamar = 650000;
            }
            case 4 -> {
                this.HargaKamar = 750000;
            }
            default -> {
                this.HargaKamar = 0;
            }
        }
        return HargaKamar;
    }
    
    public void setDurasiInap(int DurasiInap) {
        this.DurasiInap = DurasiInap;
    }

    public int getDurasiInap() {
        return DurasiInap;
    }

    public void setTotalBayar(int HargaKamar) {
        this.TotalBayar = getDurasiInap() * getHargaKamar(HargaKamar);
    } 

    public long getTotalBayar() {
        return TotalBayar;
    }
}
