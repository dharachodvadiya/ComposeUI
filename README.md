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

<img src="https://github.com/user-attachments/assets/bbe9fc9c-2309-4a8e-9180-d45f995df8b9" width="202.5" height="450">
<img src="https://github.com/user-attachments/assets/4e92bf72-7988-412a-8990-b041618e6caf" width="202.5" height="450">

[![Click to watch video](https://github.com/user-attachments/assets/9f1cc2e4-ff81-4aad-9133-4b74883e5833)

### 3. Jet Survey

- **Description**: A complete app simulating a survey experience with mock data. It covers user authentication (guest login, email login, signup), a survey flow with slide animations between questions, and a result screen.
  
- **Features**:
  - Welcome screen
  - Sign-in and sign-up flows
  - Survey with various question types presented one by one with slide animations
  - Result screen summarizing survey responses

<img src="https://github.com/user-attachments/assets/6a918d30-16b2-42f9-8b35-c64beb38e101" width="189" height="420">
<img src="https://github.com/user-attachments/assets/01829f9b-adf2-4dc5-bc8c-854cf78b6106" width="189" height="420">
<img src="https://github.com/user-attachments/assets/da2eb714-bcd4-414f-b2c3-68290deb2e4c" width="189" height="420">
<img src="https://github.com/user-attachments/assets/fc0d5f5e-6c3c-473f-9d60-873f80bab194" width="189" height="420">
<img src="https://github.com/user-attachments/assets/3e984fc8-0328-4cd8-a157-3a53daa32f13" width="189" height="420">

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
