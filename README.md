Illustration du besoin d'interfaces en Java
============================================

Les animaux
------------
Un exemple "à la main" d'un problème qu'on rencontre en codant : on se rend compte qu'on pourrait factoriser
notre propre code.
On est alors amené à modifier les classes pour "extraire les méthodes communes" dans une interface.
On s'appuie ensuite uniquement sur l'interface.


Les listes
------------
C'est l'exemple qu'on rencontre en codant tout seul, car présent partout dans les lib java.


Les méthodes __"print"__ ont l'air de faire la même chose.
Il faudrait pouvoir factoriser ce code.

Pour fonctionner, La boucle __for__ utilise en fait une méthode fournie par les deux classes : `getIterator()`

Pour pouvoir factoriser, il faut donc "déclarer" que ces deux implémentations fournissent cette méthode, et
s'appuyer sur cette déclaration.
=> C'est exactement ce qui est fait : la déclaration, c'est l'implémentation d'une interface.

L'interface commune est "Iterable", qui contient la méthode `getIterator()`.
Les implémentations "déclarent" implémenter l'interface et ont l'obligation de fournir la méthode en question.

Le code qu'on écrit nous peut dont utiliser, non plus des HashSet ou des ArrayList, mais la partie commune: Iterable.

