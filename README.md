# Calculator_App

This app features a simple yet effective user interface for calculating change, designed with a single `ConstraintLayout` as the root `ViewGroup`. The layout is meticulously crafted to provide a seamless user experience, focusing on ease of use and functionality.

## Main View Components

The app's main view is composed of the following elements:

- **Numeric Keyboard**: A numeric keypad with 10 buttons, each representing the digits 0 through 9, allows users to input amounts effortlessly.
- **Clear Button**: A dedicated button to reset the entered amount to zero, ensuring a straightforward way to start new calculations.
- **Change Table**: Located to the left of the numeric keyboard, this table dynamically displays the bills and coins that constitute the change for the entered amount, providing a clear breakdown of the change due.
- **Amount Display**: At the top of the screen, the "Price:" label is followed by the entered amount, offering an immediate view of the current total.

## Interaction Details

- **Digit Entry**: Tapping a digit button appends that digit to the current amount from the right. For instance, entering digits '2', '3', and '4' consecutively will display amounts as 0.02, 0.23, and finally 2.34, respectively.
- **Change Calculation**: As digits are entered, the Change Table on the left updates in real-time to reflect the exact composition of bills and coins needed for the change, starting from smaller denominations like ‘1¢’ and adjusting as the amount increases.
- **Reset Functionality**: The clear button, when pressed, immediately resets the entered amount to zero, allowing users to start a new calculation without any hassle.

This app is designed to provide a user-friendly interface for quickly calculating change, making it an indispensable tool for everyday transactions.

<div align="center">
<img width="516" alt="image" src="https://github.com/tusharnama37/Calculator_App/assets/67703426/ca6e7586-e197-4ea0-a71c-19ed0158ad8e">
</div>


