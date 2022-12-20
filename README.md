ITBC Кухиња
Шта се од пројекта очекује:
Поштовање основних принципа објектно оријентисаног програмирања
Добро познавање и примена тих принципа
Самосталан рад (Уз коришћење литературе и интернета)
Да буде окачен на GitHub или неку другу онлајн платформу за дељење кода
Задатак треба завршити без додатних питања
За све нејасне ствари извршити за вас логичну претпоставку и урадити задатак по њој!
Кључне ствари - Обавезне ствари су означене звездицом
1. Наслеђивање*
2. Полиморфизам*
3. Апстрактне класе*
4. Интерфејси
5. Управљање грешкама
6. Коришћење неких пројектних образаца (енг. Design Patterns)
Циљеви:
Вежбање и приказ знања основних концепата ООП-а
Самостално истраживање и сналажење у непознатом
Апликација НЕ МОРА у потпуности бити завршена, али све што је урађено треба бити добро проверено.
Преглед класа и жељених функционалности апликације
Све додатне класе или функционалности су дозвољене и пожељне
0. Интерфејс Priceable
double getPrice
1. Ingredient (abstract) implements Priceable
id
Назив састојка
2. WeightedIngredient extends Ingredient
double weight
double pricePerUnit
getPrice() -> weight * pricePerUnit
3. Recipe implements Priceable
Назив рецепта
Тежина рецепта (Enum: BEGINNER, EASY, MEDIUM, HARD, PRO)
Колекција WeightedIngredient-а
getPrice() - Укупна цена рецепта
Методе за додавање и брисање састојака
Метода која креира нови рецепт са X% састојака
Ако хоћемо пола рецепта: getScaledRecipe(50.0)
Враћа нови рецепт где је тежина сваког састојка скалирана за 50%
Ако хоћемо трећину рецепта: getScaledRecipe(33.333)
Нпр ако смо имали 6 јаја у рецепту, у новом ће бити 2 (2.xxxx)
4. Fridge
Колекција WeightedIngredient-а
Методе које додају и бришу намирнице
Hint: Ако намирница постоји, додати количину
Метода која проверава да ли је могуће направити неко јело
Hint: Водити рачуна и о количини намирница
Метода која "прави" јело, тј смањује количине састојака
Hint: Проверити да ли је уопште могуће направити јело
IT Bootcamp 9/2/2022
5. Направити "базу" свих могућих састојака
Најмање 15 почетних
6. Направити "базу" свих рецепата
Најмање 10 почетних
Апликација испод треба да буде што више интерактивна, и да кориснику нуди опције на основу "менија", где корисник бира опцију 1,2,3,... и
може да се врати назад на почетак
Напомена: И мени и његове ставке могу бити направљени кроз класе (не морају)
7. Направити апликацију која кориснику омогућава следеће:
1. Додавање намирнице у фрижидер (ако већ постоји, мења се количина)
2. Брисање намирнице из фрижидера
Смањење количине
Целокупно брисање
3. Провера која све јела може да направи са намирницама из фрижидера
4. Провера која све скалирана јела може да направи (скалирање за 50%)
5. Прављење јела (као изнад)
6. Провера која све јела могу да се направе за X динара
7. Провера која су све јела X тежине рецепта
8. Комбинација 6. и 7. услова
9. Корисник може да сортира рецепте по тежини
10. Корисник може да сортира рецепте по цени
8. Додати могућност да корисник бира "омиљене" рецепте
Корисник може да погледа омиљене рецепте
Корисник може да дода или избрише омиљене рецепте
Корисник може да погледа омиљене рецепте до X динара
