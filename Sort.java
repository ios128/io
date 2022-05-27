import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

    public static void main(String[] args) {
        // ランダムに並べられた重複のない整数の配列
        var array = new int[] { 5, 4, 6, 2, 1, 9, 8, 3, 7, 10 };
        // ソート実行
        var sortedArray = new Main().sort(array);
        // 結果出力
        Arrays.stream(sortedArray).forEach(System.out::println);
    }

    private int[] sort(int[] array) {
        // 要素が一つの場合はソートの必要がないので、そのまま返却
        if (array.length == 1) {
            return array;
        }

        // 配列の先頭を基準値とする
        var pivot = array[0];

        // ここから記述
        // pivotより大きい値を右、小さい値を左に置く
        var l=0;
        var r=array.length-1;
        while(l<=r) {
            while (array[l] < pivot) l++;
            while (array[r] > pivot) r--;
            if (l<=r) {
                var c = array[l];
                array[l] = array[r];
                array[r] = c;
                l++;
                r--;
            }
        }
        // pivotより左側を再帰的にソート
        var a1 = Arrays.copyOfRange(array, 0, l);
        a1=sort(a1);
        // pivotより右側を再帰的にソート
        var a2 = Arrays.copyOfRange(array, l, array.length);
        a2=sort(a2);
        // ソートされた左右の配列を結合
        System.arraycopy(a1, 0, array, 0, a1.length);
        System.arraycopy(a2, 0, array, a1.length, a2.length);
        return array;
        // ここまで記述

    }
}
