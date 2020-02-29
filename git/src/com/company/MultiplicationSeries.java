package com.company;

public class MultiplicationSeries implements ISubscriber {
        private int count;
        private int product = 1;
        @Override
        public void notifySubscriber(String input) {
            count = Integer.parseInt(input);
            try {
                System.out.println(MultSeries(count));
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
            int MultSeries (int num)
            {
                int number = 1;
                for (int i=0; i<num ; i++)
                {
                    product*=number;
                    number++;
                }
                return product;
            }
        }


