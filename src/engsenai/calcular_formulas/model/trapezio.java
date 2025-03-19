package engsenai.calcular_formulas.model;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class trapezio {
   private double baseMaior;
   private double baseMenor;
   private double altura;
   
   public void setBaseMaior(double baseMaior ) {
	   this.baseMaior = baseMaior;
   }
	
   public double getBaseMaior() {
	   return baseMaior;
   }

public double getBaseMenor() {
	return baseMenor;
}

public void setBaseMenor(double baseMenor) {
	this.baseMenor = baseMenor;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}
	
   private double calcularArea() {
      double area = (baseMaior + baseMenor) * altura / 2;
	}
   public void mostrarDados() {
	  System.out.println("------------");
	 System.out.println("T R A P É Z I O");
	 System.out.println("------------");
	 System.out.println("Base Menor: " + baseMenor);
	 System.out.println("Base Maior: " + baseMaior);
	 System.out.println("Altura: " + altura);
	 System.out.println("Área: " + calcularArea());
	 System.out.println("------------");  
	 }

