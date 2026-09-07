public abstract class Animal {
    private String nombre, especie;
    private int hambre, salud, higiene;
    //0-nula 1-bajo 2-moderado 3-alto

    /// NOTA: comer deberia aumentarle la vida.
    /// chequeo higiene;

    public Animal(String nombre, String especie, int hambre, int salud, int higiene) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.salud = salud;
        this.higiene = higiene;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getHambre() {
        return hambre;
    }

    public int getSalud() {
        return salud;
    }

    public int getHigiene() {
        return higiene;
    }

    /// METODOS

    //chquea si tiene hambre para comer
    public boolean chequeoComer() {
        //en el caso de comer bajo = poca hambre. mientras que alto seria mucha hambre
        if (0 < this.hambre && this.hambre <= 3) {
            return true;
            //habilita comer y permite bajar el hambre
        } else {
            return false;
            //no le permitira comer ya que no tendra hambre
        }
    }

    public boolean chequeoSucio() {
        //en el caso de higiene bajo = mucha suciedad. mientras que alto seria limpio
        if (0 < this.higiene && this.higiene <= 3) {
            return true;
            //habilita limpiarse y permite subir el higiene
        } else {
            return false;
            //no le permitira limpiarse ya que no estara sucio
        }
    }


    /// ABSGTRACTOS?
    //no se donde ni como implementar comer o que carajo, la consigna muy vaga no me pone limites
    // entonces no se si hacerlo basico y no sobrecomplicarme...
    //comer y chequeo comer podrian ir juntas...
    public void comer() {
        if (chequeoComer()) {
            this.hambre -= 1;
            this.salud -= 1;
        }

    }

    public void limpiarse() {
        if (chequeoSucio()) {
            this.higiene -= 1;
        }
    }

}
