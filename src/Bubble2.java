public class Bubble2 {
    /*
    1-3 Kirjutage sorteerimisalgoritm, mille sisendiks on täisarvude massiiv A.
Algoritm otsib massiivi vähima elemendi ja vahetab selle elemendiga A[0], siis
otsib suuruselt järgmise ja vahetab selle elemendiga A[1] jne. Analüüsige selle
algoritmi parima ja halvima juhu keerukust ja väljendage O-notatsioonis.

Meetod 1.Käib rekursiivselt massiiivi läbi, vähendades läbivaadatavaid elementi ühe korra tsükli kohta.
Meetod 2.Loob teise massiivi
Meetod 3.Salvestab väikseima elemendi, esimese elemendi ning vahetab nende asukohad. Tõstab tsükli alustamisindeksit
         ühe võrra.
*/
    int[] getSortedArray(int[] array) {
        int i = 1;
        int cycle = 0;

        while (cycle < array.length) {
                int min = array[cycle];
                int minIndex = cycle;
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            //when we're on the last element of the cycle
            if (i == array.length - 1) {
                int cycleFirstElement = array[cycle];
                array[cycle] = min;
                array[minIndex] = cycleFirstElement;
                min = array[cycle];
                continue;
            }
            cycle++;
            i = cycle + 1;
        }
        return array;
    }
}
