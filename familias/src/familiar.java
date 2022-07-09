public class familiar {
     
	    //Atributos
	    /**
	     * Nombre del familiar
	     */
	    private String nombre;
	    /**
	     * Apellido del familiar
	     */
	    private String apellido;
	    /**
		 * Segundo Apellido del familiar
	     */
	    private String segundoapellido;
	    /**
	     * Edad del familiar
	     */
	    private int edad;
	    /**
	     * La fecha de nacimiento del familiar
	     */
	    private String fechaNacimiento;

		/**
	     * lugar de nacimiento del familiar
	     */
	    private String lugarNacimiento;
		//private StringBuilder append;
	 


	    //Metodos publicos
	 
	    /**
	     * Devuelve el nombre del familiar
	     * @return nombre del familiar
	     */
	    public String getNombre() {
	        return nombre;
	    }
	 
	    /**
	     * Modifica el nombre de un familiar
	     * @param nombre
	     */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
		
	  /**
	     * Devuelve el apellido del familiar
	     * @return apellido del familiar
	     */
	    public String getApellido() {
	        return apellido;
	    }
	 
	    /**
	     * Modifica el apellido de un familiar
	     * @param apellido
	     */
	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

		/**
	     * Devuelve el Segundo apellido del familiar
	     * @return segundoapellido del familiar
	     */
	    public String getSegundoApellido() {
	        return segundoapellido;
	    }
	 
	    /**
	     * Modifica el Segundo apellido de un familiar
	     * @param segundoapellido
	     */
	    public void setsegundoApellido(String segundoapellido) {
	        this.segundoapellido = segundoapellido;
	    }
	    /**
	     * Devuelve la edad de un familiar
	     * @return  edad del familiar
	     */
	    public int getEdad() {
	        return edad;
	    }
	 
	    /**
	     * Modifica la edad de un familiar
	     * @param edad
	     */
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	 
	    /**
	     * Devuelve el La fecha de nacimiento de un familiar
	     * @return fechaNacimiento
	     */
	    public String getfechaNacimiento() {
	        return fechaNacimiento;
	    }
		/**
	     * Modifica el lugar de nacimiento de un familiar
	     * @param fechaNacimiento
	     */
	    public void setfechaNacimiento(String fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }
		/**
	     * Devuelve el lugar de nacimiento del familiar
	     * @return lugarNacimiento
	     */
	    public String getlugarNacimiento() {
	        return lugarNacimiento;
	    }
	 
	    /**
	     * Modifica el lugar de nacimiento de un familiar
	     * @param lugarNacimiento
	     */
	    public void setlugarNacimiento(String lugarNacimiento) {
	        this.lugarNacimiento = lugarNacimiento;
	    }
		

         //Constructor
	         /**
	     * Constructor por defecto
	     */
        public familiar(){
			
	        this.nombre="";
	        this.apellido="";
			this.segundoapellido="";
	        this.edad=0;
	        this.fechaNacimiento="";
			this.lugarNacimiento="";
	    }
	 
	        /**
	     * Constructor con 4 parametros
	     * @param nombre nombre del familiar
	     * @param apellido apellido del familiar
		 * @param segundoapellido segundo apellido del familiar
	     * @param edad edad del familiar
	     * @param fechaNacimiento La fecha de nacimiento del familiar
		 * @param lugarNacimiento La fecha de nacimiento del familiar
	     */
	    public familiar(String nombre, String apellido, String segundoapellido, int edad, String fechaNacimiento, String lugarNacimiento){
	        this.nombre=nombre;
	        this.apellido=apellido;
			this.segundoapellido=segundoapellido;
	        this.edad=edad;
	        this.fechaNacimiento=fechaNacimiento;
			this.lugarNacimiento=lugarNacimiento;
	    }
		 
		//Mostramos datos del familiar
		@Override

		public String toString(){
	        StringBuilder fm = new StringBuilder();
			fm.append("\nNombre : ");
			fm.append(nombre);
			fm.append("\nApellido : ");
			fm.append(apellido);
			fm.append("\nSegudo Apellido : ");
			fm.append(segundoapellido);
			fm.append("\nEdad : ");
			fm.append(edad);
			fm.append("\nFecha de nacimiento : ");
			fm.append(fechaNacimiento);
			fm.append("\nLugar de nacimiento : ");
			fm.append(lugarNacimiento);
			return fm.toString();

	    }
		
}
