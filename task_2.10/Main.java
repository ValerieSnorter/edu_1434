public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 3, 2, 3};
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("да"); //программа выводит сообщение о совпадении при каждой итерации цикла. как сделать по другому
                //я не придумала. Застряла на теме циклов и массивов(так же коллекций)
                break;
            } else if (nums[i] != nums[i + 1]) {
                System.out.println("нет");
            }
        }

    }
}
