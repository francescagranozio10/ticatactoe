package it.unisa.diem.oop.developed.groupAH;

/**
 * Interfaccia per i dispositivi dotati di uno schermo.
 *
 * @author UTENTE
 */
public interface UserInterface {

    /** Diagonale dello schermo in pollici. */
    double getScreenSize();

    /** Risoluzione orizzontale in pixel. */
    int getWidthPixels();

    /** Risoluzione verticale in pixel. */
    int getHeightPixels();

    /** Restituisce true se lo schermo è touch. */
    boolean isTouch();

    /** Metodo di default: risoluzione nel formato "1920x1080". */
    default String getResolution() {
        return getWidthPixels() + "x" + getHeightPixels();
    }

    /** Metodo di default: true se la risoluzione è almeno Full HD. */
    default boolean isFullHD() {
        return getWidthPixels() >= 1920 && getHeightPixels() >= 1080;
    }
}