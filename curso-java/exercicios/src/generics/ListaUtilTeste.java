package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {

	List<String> langs = Arrays.asList("JS", "Angular", "Java");
	List<Integer> nums = Arrays.asList(1, 2, 3);

	String ultimoLangs = (String) ListaUtil.getUltimo1(langs);
	Integer ultimoNums = (Integer) ListaUtil.getUltimo1(nums);

	String ultimoLangs2 = ListaUtil.getUltimo2(langs);
	Integer ultimoNums2 = ListaUtil.getUltimo2(nums);

	System.out.println(ultimoLangs);
	System.out.println(ultimoNums);

	System.out.println(ultimoLangs2);
	System.out.println(ultimoNums2);
    }
}
