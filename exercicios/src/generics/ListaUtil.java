package generics;

import java.util.List;

public class ListaUtil {
	
	//a ? no generics indica que a lista pode ser de qualquer tipo
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);
	}

	//para não precisar ficar fazendo o cast no retorno do objeto é possível seta um GENERIC
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);
	}
	
}
