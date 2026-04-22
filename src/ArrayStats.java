
public class ArrayStats {
    //метод валидації даних масиву
     private static void validateArray(int[] arr){
         if (arr == null || arr.length ==0 ){
             //контракт методу
             throw new IllegalArgumentException("Array must not be null or empty");
         }
     }

    public static void printArray(int[] arr){
         validateArray(arr);
       //для кожного елемента масиву arr покласті значення в змінну num та print його з пробілом
        for (int num : arr){
            System.out.print(num + " ");
        }
        //коли закінчиться цикл то перейди на новий рядок
        System.out.println();
    }

    public static int sum(int[] arr){
        validateArray(arr);
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }

    public static int min(int[] arr){
        validateArray(arr);
        int min = arr[0];
        for (int num : arr){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
    public static int max(int[] arr){
        validateArray(arr);
        int max = arr[0];
        for (int num : arr){
            if (num >  max){
                max = num;
            }
        }
        return max;
    }

    public static double average(int[] arr){
        validateArray(arr);
        //вертається значення ділення суми на килькисть елементів в масиві
        return (double) sum(arr) / arr.length;
    }
    public static void printEvenOddCount (int[] arr){
         validateArray(arr);
        //створюється 2 лічильника
         int even = 0;
         int odd = 0;
       //проходимо по масиву
         for (int num : arr){
             //остача від ділення
             if (num % 2 == 0){
                 //якщо парне додаємо лічильник
                 even++;
             } else {
                 //якщо непарне додаємо лічильник
                 odd++;
             }
         }
         System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
