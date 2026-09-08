import java.util.random.RandomGenerator;

public abstract class Animal {
    private String nombre, especie;
    private int hambre, salud, higiene;
    private boolean enfermo;
    //0-nula 1-bajo 2-moderado 3-alto

    /// NOTA: comer deberia aumentarle la vida.
    /// chequeo higiene;

    public Animal(String nombre, String especie, int hambre, int salud, int higiene,boolean enfermo) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.salud = salud;
        this.higiene = higiene;
        this.enfermo = enfermo;
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

    public boolean isEnfermo() {
        return enfermo;
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

    public boolean chequeoSalud() {
        //va de 0 a 3, cuando lleguie al 0 se enfermara pero no morira.
        if(this.salud < 0){
            this.salud = 0;

        }
        if (0 < this.salud && this.salud <= 3) {
            return true;
            //permite subirle la vida siempre y cuando sea mayor a 0.
            //para sacarle la enfermedad debera de llamar en el main a la opcion diferente de "enfermarse"
        } else {
            return false;
            //no le permitira sanarse ya que esta al maximo o debilitado.
        }
    }


    /// ABSGTRACTOS?
    //no se donde ni como implementar comer o que carajo, la consigna muy vaga no me pone limites
    // entonces no se si hacerlo basico y no sobrecomplicarme...
    //comer y chequeo comer podrian ir juntas...
    public void comer() {
        if (chequeoComer()) {
            this.hambre -= 1;
            if (chequeoSalud()) {
                this.salud += 1;
            }
        }

    }

    public void limpiarse() {
        if (chequeoSucio()) {
            this.higiene -= 1;
        }
    }

    public void correr() {
        // En lugar de "new Random()", pides el generador por defecto de Java
        RandomGenerator generator = RandomGenerator.getDefault();

        // El resto del código funciona exactamente igual
        int numeroAleatorio = generator.nextInt(0, 101); // Rango directo entre 0 y 100


        if (numeroAleatorio > 70) {
            this.salud -= 1;
        }
    }
    
    public void rehabilitar(){
        if(this.salud == 0){
            this.salud += 1;
            enfermarse();
        }
    }

    public boolean enfermarse(){
        //si esta enfermo pasa a estar sano y viceversa

        if(this.enfermo == true){
            return false;
        }else{
            return true;
        }


    }

}


