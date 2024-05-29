package rand.freq;

public class RandNumFreq {

  public static int randomNumGenerator() {
    return (int) (Math.random() * 21);
  }

  public static void randomNumberFrequency() {
    int[] randomInts = new int[1000];
    for (int i = 0; i < randomInts.length; i++) {
      randomInts[i] = randomNumGenerator();
    }
    int count = 0;
    int[] countArr = new int[20];
    for (int i = 0; i < countArr.length; i++) {
      count = 0;
      for (int j : randomInts) {
        if (j == i) {
          count++;
        }
      }
      countArr[i] = count;
    }
    for (int i = 0; i < countArr.length; i++) {
      System.out.println((i + 1) + " was returned " + countArr[i] + " times!");
    }
  }
}
