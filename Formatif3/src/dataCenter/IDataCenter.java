package dataCenter;

public interface IDataCenter {
    /**
     * Récupère la valeur calculée de la cellule à (ligne, colonne) dans la collection.
     * Si c'est une formule, elle sera interprétée.
     * Si la cellule à ligne, colonne est vide, la méthode retourne une chaîne vide.
     * Une formule commence par un "="
     * (0,0) est la coordonnée de la cellule A1.
     * @param ligne de la cellule
     * @param col de la cellule
     * @return la valeur CALCULÉE sous forme d’un string de la cellule à (ligne, colonne) Ex =1+1 retournerait 2
     */
    String getValue(int ligne, int col);

    /**
     * Récupère la formule de la cellule à (ligne, colonne) dans la collection.
     * Si c'est une formule, elle NE sera PAS interprétée.
     * (0,0) est la coordonnée de la cellule A1.
     * @param ligne de la cellule
     * @param col de la cellule
     * @return la valeur de la cellule à (ligne, colonne). Le contenu N’est PAS interprété. Ex =A1+1
     */
    String getFormula(int ligne, int col);

    /**
     * Ajoute la formule sans la calculer dans la collection.
     * (0,0) est la coordonnée de la cellule A1.
     * @param ligne de la cellule
     * @param col de la cellule
     * @param newVal la nouvelle valeur qui sera placée dans la cellule à la (ligne, colonne)
     * @return la nouvelle valeur qui sera placée dans la cellule à la (ligne, colonne)
     */
    String set(int ligne, int col, String newVal);

    /**
     * Enlève toutes les données de la structure de données.
     */
    void removeAllData();
}
