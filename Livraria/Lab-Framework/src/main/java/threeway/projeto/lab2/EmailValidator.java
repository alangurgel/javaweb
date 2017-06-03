package threeway.projeto.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator{
	//Regex que verifica email valido 
	
	private static final String EMAIL_PATTEN = "^[_A-Za-z0-9-]+(\\."+"[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*"+"(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	private Matcher matcher;
	
	public EmailValidator(){
		pattern = Pattern.compile(EMAIL_PATTEN);
	}
	@Override
	public void validate(FacesContext context,UIComponent component,Object value)throws ValidatorException{
		
		matcher = pattern.matcher(value.toString());
		if(!matcher.matches()){
			FacesMessage msg = new FacesMessage("Validação de Email falhou.", "Email informado inválido.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
}
