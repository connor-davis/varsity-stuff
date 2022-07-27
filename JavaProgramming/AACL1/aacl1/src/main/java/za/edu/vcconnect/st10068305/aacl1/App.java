package za.edu.vcconnect.st10068305.aacl1;

/**
 * Hello world!
 *
 */
public class App {
    private static int[] numbers = new int[] { 770, 802, 563, 596, 455, 441, 354, 412, 900, 242, 828, 727, 446, 622,
            632, 217, 769, 749, 85, 445, 54, 3, 955, 683, 586, 529, 949, 653, 91, 670, 19, 406, 345, 717, 532, 521, 172,
            619, 39, 287, 222, 366, 518, 759, 227, 331, 493, 601, 724, 60, 877, 745, 886, 202, 526, 799, 893, 78, 194,
            689, 188, 430, 623, 552, 772, 303, 905, 312, 41, 15, 541, 591, 327, 318, 677, 603, 381, 931, 80, 230, 213,
            575, 857, 809, 125, 241, 397, 146, 438, 515, 784, 376, 71, 597, 228, 777, 902, 848, 339, 679, 255, 273, 595,
            605, 293, 897, 859, 304, 779, 564, 763, 543, 503, 854, 215, 520, 226, 673, 519, 276, 328, 694, 795, 9, 322,
            38, 666, 803, 471, 133, 942, 404, 181, 785, 232, 319, 903, 918, 946, 118, 243, 614, 93, 156, 433, 290, 210,
            538, 371, 238, 864, 7, 407, 393, 656, 533, 558, 517, 467, 497, 439, 608, 450, 469, 573, 374, 805, 73, 152,
            259, 588, 943, 185, 219, 988, 621, 993, 925, 738, 958, 709, 26, 567, 196, 920, 61, 589, 251, 237, 170, 151,
            372, 500, 815, 787, 926, 836, 420, 536, 233, 466, 379, 825, 59, 587, 405, 12, 972, 72, 66, 391, 378, 630,
            846, 754, 870, 545, 263, 682, 983, 168, 524, 277, 266, 550, 901, 688, 860, 180, 46, 808, 408, 308, 984, 844,
            285, 950, 985, 252, 247, 674, 569, 817, 822, 81, 23, 138, 362, 92, 889, 394, 508, 758, 858, 600, 326, 986,
            523, 792, 16, 24, 459, 561, 410, 383, 613, 197, 323, 96, 753, 206, 116, 186, 296, 964, 22, 863, 451, 274,
            112, 414, 721, 783, 457, 214, 478, 570, 365, 139, 265, 201, 602, 389, 89, 719, 370, 728, 481, 636, 791, 128,
            593, 386, 804, 750, 463, 675, 491, 556, 75, 179, 807, 258, 776, 999, 771, 924, 941, 18, 134, 432, 705, 977,
            10, 184, 522, 349, 748, 220, 44, 823, 369, 856, 643, 254, 553, 663, 250, 581, 888, 65, 415, 996, 699, 334,
            88, 474, 343, 739, 909, 357, 191, 171, 388, 149, 652, 701, 615, 609, 297, 932, 766, 398, 496, 43, 342, 95,
            849, 144, 443, 884, 368, 199, 697, 937, 837, 487, 301, 260, 101, 157, 257, 906, 742, 302, 827, 268, 436,
            928, 743, 875, 375, 162, 377, 923, 833, 384, 98, 970, 789, 264, 449, 801, 67, 448, 672, 757, 286, 147, 645,
            422, 700, 907, 767, 361, 874, 203, 53, 74, 2, 853, 148, 434, 490, 472, 315, 525, 231, 100, 796, 464, 246,
            577, 527, 813, 239, 50, 488, 744, 781, 922, 45, 537, 775, 559, 200, 373, 178, 358, 911, 13, 661, 814, 510,
            927, 678, 161, 114, 482, 21, 208, 887, 626, 651, 417, 930, 305, 702, 611, 105, 411, 820, 87, 690, 891, 638,
            650, 711, 944, 782, 4, 566, 225, 55, 253, 123, 806, 109, 120, 431, 444, 707, 641, 841, 306, 124, 821, 929,
            512, 8, 921, 912, 691, 762, 598, 501, 1000, 419, 283, 546, 76, 338, 994, 204, 235, 835, 746, 735, 269, 990,
            115, 352, 82, 894, 945, 716, 831, 267, 159, 680, 175, 425, 245, 703, 612, 539, 402, 110, 904, 530, 830, 20,
            221, 428, 686, 730, 997, 760, 401, 347, 838, 627, 557, 427, 173, 337, 568, 816, 495, 892, 35, 321, 62, 289,
            966, 845, 340, 447, 793, 198, 869, 992, 486, 780, 919, 851, 229, 534, 940, 83, 973, 511, 234, 468, 160, 166,
            193, 57, 740, 452, 693, 86, 747, 667, 947, 725, 360, 979, 102, 344, 840, 592, 311, 969, 58, 786, 403, 967,
            692, 27, 51, 628, 852, 914, 681, 868, 320, 934, 165, 356, 284, 30, 79, 163, 995, 723, 583, 562, 832, 812,
            256, 278, 774, 580, 756, 590, 333, 117, 33, 798, 631, 429, 637, 708, 47, 991, 873, 933, 572, 187, 548, 440,
            291, 867, 145, 549, 855, 713, 140, 535, 639, 17, 898, 732, 77, 437, 272, 423, 351, 399, 309, 502, 866, 135,
            355, 183, 14, 111, 212, 726, 270, 542, 153, 70, 872, 479, 136, 695, 177, 127, 341, 978, 94, 421, 456, 224,
            498, 409, 392, 477, 755, 324, 216, 847, 737, 190, 329, 594, 280, 195, 460, 350, 68, 571, 560, 633, 244, 629,
            182, 965, 778, 454, 298, 811, 916, 981, 980, 834, 505, 794, 826, 32, 313, 659, 142, 948, 130, 582, 531, 275,
            129, 261, 736, 249, 48, 31, 722, 687, 295, 442, 655, 507, 516, 963, 618, 660, 176, 714, 28, 862, 42, 540,
            167, 704, 121, 1, 685, 359, 960, 314, 644, 189, 882, 288, 346, 968, 29, 975, 316, 499, 640, 971, 484, 987,
            489, 97, 915, 576, 103, 49, 764, 126, 551, 741, 899, 307, 962, 34, 25, 11, 330, 710, 396, 607, 154, 240,
            706, 885, 137, 843, 494, 385, 616, 158, 585, 461, 554, 818, 642, 424, 390, 207, 476, 610, 483, 718, 353,
            712, 871, 458, 865, 878, 547, 953, 141, 413, 824, 729, 861, 752, 976, 40, 453, 896, 223, 37, 131, 480, 416,
            132, 698, 773, 5, 143, 625, 790, 879, 648, 998, 509, 635, 880, 761, 90, 913, 218, 797, 236, 606, 418, 106,
            209, 348, 164, 332, 292, 555, 513, 174, 733, 336, 731, 335, 380, 842, 435, 662, 634, 300, 684, 119, 974,
            584, 956, 262, 282, 169, 64, 952, 6, 387, 829, 113, 325, 462, 382, 279, 599, 426, 248, 658, 192, 751, 720,
            281, 959, 800, 620, 84, 669, 475, 910, 492, 657, 364, 271, 624, 465, 850, 810, 107, 514, 917, 881, 839, 52,
            715, 470, 954, 63, 646, 734, 56, 363, 565, 150, 876, 574, 528, 155, 982, 122, 989, 895, 395, 765, 649, 647,
            504, 367, 890, 671, 604, 579, 473, 69, 668, 104, 908, 939, 883, 544, 205, 951, 676, 294, 654, 211, 400, 938,
            665, 788, 317, 957, 578, 485, 299, 108, 617, 819, 696, 935, 99, 936, 310, 961, 36, 506, 664, 768 };

    private static long timeStart, timeEnd, timeTaken;

    public static void main(String[] args) {
        System.out.println("Starting Bubble sort.");

        timeStart = System.currentTimeMillis();
        int[] bubbleSorted = bubbleSort(numbers);
        timeEnd = System.currentTimeMillis();

        timeTaken = timeEnd - timeStart;

        System.out.println("Bubble sort took " + timeTaken + " ms");

        System.out.println("");

        for (int num : bubbleSorted) {
            if (num % 10 >= 1)
                System.out.print(num + ", \t");
            else
                System.out.print(num + ", \n");
        }

        System.out.println("");

        System.out.println("Starting Insertion sort.");

        timeStart = System.currentTimeMillis();
        int[] insertionSorted = insertionSort(numbers);
        timeEnd = System.currentTimeMillis();

        timeTaken = timeEnd - timeStart;

        System.out.println("Insertion sort took " + timeTaken + " ms");

        System.out.println("");

        for (int num : insertionSorted) {
            if (num % 10 >= 1)
                System.out.print(num + ", \t");
            else
                System.out.print(num + ", \n");
        }

        System.out.println("");
    }

    /**
     * This method will use the bubble sort algorithm to sort an int[] of numbers.
     * 
     * @param numbers
     * 
     * @return int[]
     */
    public static int[] bubbleSort(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int a = numbers[i];
                int b = numbers[i + 1];

                if (a > b) {
                    numbers[i] = b;
                    numbers[i + 1] = a;
                }
            }
        }

        return numbers;
    }

    /**
     * This method will use the insertion sort algorithm to sort an int[] of
     * numbers.
     * 
     * @param numbers
     * 
     * @return int[]
     */
    public static int[] insertionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            int el = numbers[i];
            int x = i - 1;

            while (x >= 0 && numbers[x] > el) {
                numbers[x + 1] = numbers[x];
                x = x - 1;
            }

            numbers[x + 1] = el;
        }

        return numbers;
    }
}
