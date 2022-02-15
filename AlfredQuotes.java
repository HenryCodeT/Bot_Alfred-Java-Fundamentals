import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        return "Hola, " + name + ", Encantado de verte.";
    }
    
    public String dateAnnouncement() {
        return String.format("actualmente es %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "Ella no es de ayuda que puedo hacer por ti?";
        }
        if (conversation.indexOf("Alfred")>-1){
            return "A su servicio como puedo ser de ayuda?";
        }
        return "para respuesta sarcástica devolver cadena";
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    // BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!copy
}