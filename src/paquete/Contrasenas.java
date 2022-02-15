
package paquete;
import java.util.Random;

public class Contrasenas 
{
    private String validos = "0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm#/-_+*,.", contrasena,
			may = "QWERTYUIOPASDFGHJKLZXCVBNM", min = "qwertyuiopasdfghjklzxcvbnm", num = "0123456789", ce = "#/-_+*,.";
	private int conmin, conmay, connum, conce, pos;
        
        public String Generador()
	{
		Random obr = new Random();
		do
		{
			contrasena = "";
			while (contrasena.length() < 8)
				contrasena += validos.charAt(obr.nextInt(validos.length()));
		}
		while (!this.Validar(contrasena));
		return contrasena;
	}

	private boolean Validar(String contrasena)
	{
		if (contrasena.length() == 8)
		{
			conmin = 0;
			conmay = 0;
			connum = 0;
			conce = 0;
			for (pos = 0; pos < contrasena.length(); pos++)
			{
				if (may.contains(contrasena.charAt(pos) + ""))
					conmay++;
				if (min.contains(contrasena.charAt(pos) + ""))
					conmin++;
				if (num.contains(contrasena.charAt(pos) + ""))
					connum++;
				if (ce.contains(contrasena.charAt(pos) + ""))
					conce++;
			}
			if (conmay > 0 && conmin > 0 && connum > 0 && conce > 0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
