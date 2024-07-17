# Jetpack Compose UI Showcase

This repository contains a collection of Jetpack Compose modules showcasing various UI components and animations using Kotlin. Each module focuses on different aspects of UI development with Jetpack Compose.

## Modules

### 1. Basic Layout

- **Description**: Demonstrates basic layout structures using Jetpack Compose. Includes a search bar, multiple scrollable rows on a single screen, and a bottom navigation bar that adapts between portrait and landscape orientations.
  
- **Features**:
  - Search bar implementation
  - Multiple scrollable rows
  - Responsive layout changes between portrait and landscape
  - Adaptive bottom navigation
 
**Portrait Mode**:  

<img src="https://github.com/user-attachments/assets/df3b4c60-b78a-4592-bcdd-8ee1d420b05c" width="202.5" height="450">

**LandScape Mode**:

<img src="https://github.com/user-attachments/assets/273f14a0-047d-4d35-8607-6968716678a1" width="450" height="202.5">

### 2. Basic Animation

- **Description**: Features animated transitions and interactions within a tabbed interface. Includes expandable lists, tab navigation animations, and adaptive floating action button behavior based on scroll direction.
  
- **Features**:
  - Tabbed interface with animated background color changes
  - Expandable lists with smooth item expansion
  - Adaptive floating action button (icon only on scroll up, label + icon on scroll down)
  - Transition animations between tabs

### 3. Jet Survey

- **Description**: A complete app simulating a survey experience with mock data. It covers user authentication (guest login, email login, signup), a survey flow with slide animations between questions, and a result screen.
  
- **Features**:
  - Welcome screen
  - Sign-in and sign-up flows
  - Survey with various question types presented one by one with slide animations
  - Result screen summarizing survey responses

## Getting Started

To run any of the modules locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/dharachodvadiya/ComposeUI.git

2. Open the project in Android Studio.
3. Navigate to the module of interest and run the project on an emulator or physical device.

### Dependencies
  - kotlin version "1.9.0"
  - composeBom version "2024.04.01"
