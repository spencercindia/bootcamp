package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonsInWoods = 3;
		int racoonsThatLeft = 2;
		int racoonsAtHome = racoonsInWoods - racoonsThatLeft;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int differenceBeesFlowers = numberOfFlowers - numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int pigeonsThatJoin = 1;
		int totalPigeons = lonelyPigeon + pigeonsThatJoin;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsThatJoin = 2;
		int totalOwls = owlsOnFence + owlsThatJoin;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int leftToSwim = 1;
		workingBeavers -= leftToSwim;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansThatJoin = 1;
		int totalToucans = toucansSitting + toucansThatJoin;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numOfSquirrels = 4;
		int numNuts = 2;
		int squirrelNutDiff = numOfSquirrels - numNuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25;
		double dime = .1;
		double nickel = .05;
		double mrsHiltsMoney = quarter + dime + nickel*2;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macAdamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffinsFirstGrade = brierMuffins + macAdamsMuffins + flanneryMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = .24;
		double whistleCost = .14;
		double toyCost = yoyoCost + whistleCost;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispiesCount = 5;
		int largeMarsh = 8;
		int smallMarsh = 10;
		int marshTotal = largeMarsh + smallMarsh;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltSnowFallInches = 29;
		int brecknockSnowFallInches = 17;
		int snowFallDifference = hiltSnowFallInches - brecknockSnowFallInches;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltDailyBudget = 10;
		int toyTruckCost = 3;
		int pencilCaseCost = 2;
		double hiltDailyBudgetRemaining = hiltDailyBudget - toyTruckCost - pencilCaseCost;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbleCount = 16;
		int marblesLost = 7;
		int joshTotalMarbles = joshMarbleCount - marblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeaShellCount = 19;
		int seaShellDemand = 25;
		int seaShellDiff = seaShellDemand - meganSeaShellCount;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloonCount = 17;
		int redBallonCount = 8;
		int greenBallonCount = bradBalloonCount - redBallonCount;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martaAddsBooks = 10;
		int finalBookCount = booksOnShelf + martaAddsBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeNumOfLegs = 6;
		int beeCount = 8;
		int numOfBeeLegs = beeNumOfLegs * beeCount;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCost = .99;
		double iceCreamBill = iceCreamCost * 2;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int gardenBorderRocksTotal = 125;
		int hiltRocksCount = 64;
		int gardenRockNeed = gardenBorderRocksTotal - hiltRocksCount;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarblesCount = 38;
		int hiltMarblesLoss = 15;
		int hiltMarblesTotal = hiltMarblesCount - hiltMarblesLoss;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesTravelled = 32;
		int milesToGo = milesToConcert - milesTravelled;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesShovelSatMorn = 90;
		int minutesShovelSatAft = 45;
		int minutesShovelTotal = minutesShovelSatAft + minutesShovelSatMorn;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hiltHotDogCount = 6;
		double hotDogCost = .5;
		double hiltHotDogBill = hiltHotDogCount * hotDogCost;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltPencilBudget = 50;
		int pencilCost = 7;
		int pencilsHiltCanAfford = hiltPencilBudget/pencilCost;

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflySightings = 33;
		int orangeButterflyCount = 20;
		int redButterflyCount = butterflySightings - orangeButterflyCount;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double amountKatePaid = 1.00;
		double candyForKateCost = .54;
		double changeForKate = amountKatePaid - candyForKateCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markTreeCount = 13;
		int markTreesPlanted = 12;
		int markTreeTotal = markTreeCount + markTreesPlanted;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillJoySeesGMA = 2;
		int hoursInADay = 24;
		int hoursTillJoySeesGMA = hoursInADay * daysTillJoySeesGMA;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimNumOfCousins = 4;
		int piecesOfGumPer = 5;
		int kimGumDemand = kimNumOfCousins * piecesOfGumPer;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danCandyBudget = 3.00;
		double danCandyCost = 1.00;
		double danMoneyLeft = danCandyBudget - danCandyCost;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int boatCanHold = 3;
		int peopleOnBoatsOnTheLake = boatsOnTheLake * boatCanHold;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegoCount = 380;
		int ellenLegosLost = 57;
		int ellenLegosTotal = ellenLegoCount - ellenLegosLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurMuffinsCount = 35;
		int arthurMuffinsTotal = 83;
		int arthurMufffinsNeeded = arthurMuffinsTotal - arthurMuffinsCount;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayonCount = 1400;
		int lucyCrayonCount = 290;
		int crayonDiff = willyCrayonCount - lucyCrayonCount;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickerCount = 10;
		int numOfStickerPages = 22;
		int stickerTotal = stickerCount * numOfStickerPages;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakesForTheKids = 100;
		double numOfKids = 8;
		double cupcakesPerKid = cupcakesForTheKids/numOfKids;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookieCount = 47;
		int gingerbreadJarCanHold = 6;
		int cookiesWithNoJar = gingerbreadCookieCount%gingerbreadJarCanHold;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissantCount = 59;
		int neighborCount = 8;
		int leftoverCroissants = croissantCount%neighborCount;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesTrayCanHold = 12;
		int cookiesMarianNeeds = 276;
		int traysMarianNeeds = cookiesMarianNeeds/cookiesTrayCanHold;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int marianFriendPretzelCount = 480;
		int pretzelServing = 12;
		int pretzelServingsAvail = marianFriendPretzelCount/pretzelServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int marianLemonCakes = 53;
		int lemonCakeBoxHolds = 3;
		int lemonCakesForgotten = 2;
		int lemonCakesGivenAway = (marianLemonCakes - 2)/3;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int momsCarrotSticks = 74;
		int peopleWhoGetCarrots = 12;
		int leftoverCarrots = momsCarrotSticks%peopleWhoGetCarrots;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int sistersTeddies = 98;
		int teddiesShelfCanHold = 7;
		int shelvesFilled = sistersTeddies/teddiesShelfCanHold;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumCanHold = 20;
		int susiePictureCollection = 480;
		int albumsNeeded = susiePictureCollection/albumCanHold;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int joesTradingCards = 94;
		int cardBoxCanHold = 8;
		int leftoverCards = joesTradingCards%cardBoxCanHold;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susiesDadBookCount = 210;
		int shelfCount = 10;
		int bookshelfContains = susiesDadBookCount/shelfCount;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double christinaCroissant = 17;
		double christinaGuestCount = 7;
		double christinaGuestCroissantCount = christinaCroissant/christinaGuestCount;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double roomCount = 5;
		double wallsTotalFeet = (12*14);
		double billsTime = 2.15;
		double billsTotalTime = billsTime*roomCount;
		double jillsTime = 1.90;
		double jillsTotalTime = jillsTime*roomCount;
		double teamTotalTime = billsTotalTime+jillsTotalTime;
		double timeToCompleteJob = wallsTotalFeet/teamTotalTime;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInit = "B";
		String fullName = lastName + ", " + firstName + " " + middleInit + ".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceBetweenNYCHI = 800.0;
		double distanceTravelled = 537.0;
		int percentageCompleted = (int)((distanceTravelled/distanceBetweenNYCHI) * 100);
	}

}
