# TicTacToe-Client
# Tic-Tac-Toe Game 
[![forthebadge](data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxODMuMTcwMDAwMDAwMDAwMDIiIGhlaWdodD0iMzUiIHZpZXdCb3g9IjAgMCAxODMuMTcwMDAwMDAwMDAwMDIgMzUiPjxyZWN0IGNsYXNzPSJzdmdfX3JlY3QiIHg9IjAiIHk9IjAiIHdpZHRoPSIxMTUuMzEiIGhlaWdodD0iMzUiIGZpbGw9IiNDQTJENDYiLz48cmVjdCBjbGFzcz0ic3ZnX19yZWN0IiB4PSIxMTMuMzEiIHk9IjAiIHdpZHRoPSI2OS44NjAwMDAwMDAwMDAwMSIgaGVpZ2h0PSIzNSIgZmlsbD0iI0ZGMDcwNSIvPjxwYXRoIGNsYXNzPSJzdmdfX3RleHQiIGQ9Ik0xNS42OSAyMkwxNC4yMiAyMkwxNC4yMiAxMy40N0wxNi4xNCAxMy40N0wxOC42MCAyMC4wMUwyMS4wNiAxMy40N0wyMi45NyAxMy40N0wyMi45NyAyMkwyMS40OSAyMkwyMS40OSAxOS4xOUwyMS42NCAxNS40M0wxOS4xMiAyMkwxOC4wNiAyMkwxNS41NSAxNS40M0wxNS42OSAxOS4xOUwxNS42OSAyMlpNMjguNDkgMjJMMjYuOTUgMjJMMzAuMTcgMTMuNDdMMzEuNTAgMTMuNDdMMzQuNzMgMjJMMzMuMTggMjJMMzIuNDkgMjAuMDFMMjkuMTggMjAuMDFMMjguNDkgMjJaTTMwLjgzIDE1LjI4TDI5LjYwIDE4LjgyTDMyLjA3IDE4LjgyTDMwLjgzIDE1LjI4Wk00MS4xNCAyMkwzOC42OSAyMkwzOC42OSAxMy40N0w0MS4yMSAxMy40N1E0Mi4zNCAxMy40NyA0My4yMSAxMy45N1E0NC4wOSAxNC40OCA0NC41NyAxNS40MFE0NS4wNSAxNi4zMyA0NS4wNSAxNy41Mkw0NS4wNSAxNy41Mkw0NS4wNSAxNy45NVE0NS4wNSAxOS4xNiA0NC41NyAyMC4wOFE0NC4wOCAyMS4wMCA0My4xOSAyMS41MFE0Mi4zMCAyMiA0MS4xNCAyMkw0MS4xNCAyMlpNNDAuMTcgMTQuNjZMNDAuMTcgMjAuODJMNDEuMTQgMjAuODJRNDIuMzAgMjAuODIgNDIuOTMgMjAuMDlRNDMuNTUgMTkuMzYgNDMuNTYgMTcuOTlMNDMuNTYgMTcuOTlMNDMuNTYgMTcuNTJRNDMuNTYgMTYuMTMgNDIuOTYgMTUuNDBRNDIuMzUgMTQuNjYgNDEuMjEgMTQuNjZMNDEuMjEgMTQuNjZMNDAuMTcgMTQuNjZaTTU1LjA5IDIyTDQ5LjUxIDIyTDQ5LjUxIDEzLjQ3TDU1LjA1IDEzLjQ3TDU1LjA1IDE0LjY2TDUxLjAwIDE0LjY2TDUxLjAwIDE3LjAyTDU0LjUwIDE3LjAyTDU0LjUwIDE4LjE5TDUxLjAwIDE4LjE5TDUxLjAwIDIwLjgyTDU1LjA5IDIwLjgyTDU1LjA5IDIyWk02Ni42NSAyMkw2NC42OCAxMy40N0w2Ni4xNSAxMy40N0w2Ny40NyAxOS44OEw2OS4xMCAxMy40N0w3MC4zNCAxMy40N0w3MS45NiAxOS44OUw3My4yNyAxMy40N0w3NC43NCAxMy40N0w3Mi43NyAyMkw3MS4zNSAyMkw2OS43MyAxNS43N0w2OC4wNyAyMkw2Ni42NSAyMlpNODAuMzggMjJMNzguOTAgMjJMNzguOTAgMTMuNDdMODAuMzggMTMuNDdMODAuMzggMjJaTTg2Ljg3IDE0LjY2TDg0LjIzIDE0LjY2TDg0LjIzIDEzLjQ3TDkxLjAwIDEzLjQ3TDkxLjAwIDE0LjY2TDg4LjM0IDE0LjY2TDg4LjM0IDIyTDg2Ljg3IDIyTDg2Ljg3IDE0LjY2Wk05Ni4yNCAyMkw5NC43NSAyMkw5NC43NSAxMy40N0w5Ni4yNCAxMy40N0w5Ni4yNCAxNy4wMkwxMDAuMDUgMTcuMDJMMTAwLjA1IDEzLjQ3TDEwMS41MyAxMy40N0wxMDEuNTMgMjJMMTAwLjA1IDIyTDEwMC4wNSAxOC4yMUw5Ni4yNCAxOC4yMUw5Ni4yNCAyMloiIGZpbGw9IiNGRkZGRkYiLz48cGF0aCBjbGFzcz0ic3ZnX190ZXh0IiBkPSJNMTMzLjg4IDIyTDEyNy41MCAyMkwxMjcuNTAgMTMuNjBMMTI5Ljg4IDEzLjYwTDEyOS44OCAyMC4xMUwxMzMuODggMjAuMTFMMTMzLjg4IDIyWk0xMzcuODcgMTcuODBMMTM3Ljg3IDE3LjgwUTEzNy44NyAxNi41NSAxMzguNDggMTUuNTVRMTM5LjA4IDE0LjU2IDE0MC4xNSAxNC4wMFExNDEuMjEgMTMuNDMgMTQyLjU0IDEzLjQzTDE0Mi41NCAxMy40M1ExNDMuODcgMTMuNDMgMTQ0LjkzIDE0LjAwUTE0Ni4wMCAxNC41NiAxNDYuNjAgMTUuNTVRMTQ3LjIxIDE2LjU1IDE0Ny4yMSAxNy44MEwxNDcuMjEgMTcuODBRMTQ3LjIxIDE5LjA1IDE0Ni42MCAyMC4wNFExNDYuMDAgMjEuMDQgMTQ0Ljk0IDIxLjYwUTE0My44NyAyMi4xNyAxNDIuNTQgMjIuMTdMMTQyLjU0IDIyLjE3UTE0MS4yMSAyMi4xNyAxNDAuMTUgMjEuNjBRMTM5LjA4IDIxLjA0IDEzOC40OCAyMC4wNFExMzcuODcgMTkuMDUgMTM3Ljg3IDE3LjgwWk0xNDAuMjcgMTcuODBMMTQwLjI3IDE3LjgwUTE0MC4yNyAxOC41MSAxNDAuNTcgMTkuMDVRMTQwLjg3IDE5LjYwIDE0MS4zOSAxOS45MFExNDEuOTEgMjAuMjAgMTQyLjU0IDIwLjIwTDE0Mi41NCAyMC4yMFExNDMuMTggMjAuMjAgMTQzLjY5IDE5LjkwUTE0NC4yMSAxOS42MCAxNDQuNTEgMTkuMDVRMTQ0LjgxIDE4LjUxIDE0NC44MSAxNy44MEwxNDQuODEgMTcuODBRMTQ0LjgxIDE3LjA5IDE0NC41MSAxNi41NFExNDQuMjEgMTYgMTQzLjY5IDE1LjcwUTE0My4xOCAxNS40MCAxNDIuNTQgMTUuNDBMMTQyLjU0IDE1LjQwUTE0MS45MCAxNS40MCAxNDEuMzkgMTUuNzBRMTQwLjg3IDE2IDE0MC41NyAxNi41NFExNDAuMjcgMTcuMDkgMTQwLjI3IDE3LjgwWk0xNTQuNTIgMjJMMTUwLjkzIDEzLjYwTDE1My41MCAxMy42MEwxNTUuNzggMTkuMDdMMTU4LjExIDEzLjYwTDE2MC40NiAxMy42MEwxNTYuODYgMjJMMTU0LjUyIDIyWk0xNzEuMzYgMjJMMTY0LjYxIDIyTDE2NC42MSAxMy42MEwxNzEuMjAgMTMuNjBMMTcxLjIwIDE1LjQ0TDE2Ni45NyAxNS40NEwxNjYuOTcgMTYuODVMMTcwLjcwIDE2Ljg1TDE3MC43MCAxOC42M0wxNjYuOTcgMTguNjNMMTY2Ljk3IDIwLjE3TDE3MS4zNiAyMC4xN0wxNzEuMzYgMjJaIiBmaWxsPSIjRkZGRkZGIiB4PSIxMjYuMzEiLz48L3N2Zz4=)](https://forthebadge.com) [![forthebadge](data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNjcuMyIgaGVpZ2h0PSIzNSIgdmlld0JveD0iMCAwIDE2Ny4zIDM1Ij48cmVjdCBjbGFzcz0ic3ZnX19yZWN0IiB4PSIwIiB5PSIwIiB3aWR0aD0iOTcuNzEwMDAwMDAwMDAwMDEiIGhlaWdodD0iMzUiIGZpbGw9IiMzQzlBRDUiLz48cmVjdCBjbGFzcz0ic3ZnX19yZWN0IiB4PSI5NS43MTAwMDAwMDAwMDAwMSIgeT0iMCIgd2lkdGg9IjcxLjU5IiBoZWlnaHQ9IjM1IiBmaWxsPSIjMTQ4NENBIi8+PHBhdGggY2xhc3M9InN2Z19fdGV4dCIgZD0iTTE3LjMzIDIyTDE0LjIyIDIyTDE0LjIyIDEzLjQ3TDE3LjE0IDEzLjQ3UTE4LjU5IDEzLjQ3IDE5LjM0IDE0LjA1UTIwLjEwIDE0LjYzIDIwLjEwIDE1Ljc4TDIwLjEwIDE1Ljc4UTIwLjEwIDE2LjM2IDE5Ljc4IDE2LjgzUTE5LjQ3IDE3LjMwIDE4Ljg2IDE3LjU2TDE4Ljg2IDE3LjU2UTE5LjU1IDE3Ljc1IDE5LjkzIDE4LjI2UTIwLjMxIDE4Ljc4IDIwLjMxIDE5LjUxTDIwLjMxIDE5LjUxUTIwLjMxIDIwLjcxIDE5LjUzIDIxLjM2UTE4Ljc2IDIyIDE3LjMzIDIyTDE3LjMzIDIyWk0xNS43MCAxOC4xNUwxNS43MCAyMC44MkwxNy4zNSAyMC44MlExOC4wNCAyMC44MiAxOC40NCAyMC40N1ExOC44MyAyMC4xMyAxOC44MyAxOS41MUwxOC44MyAxOS41MVExOC44MyAxOC4xOCAxNy40NyAxOC4xNUwxNy40NyAxOC4xNUwxNS43MCAxOC4xNVpNMTUuNzAgMTQuNjZMMTUuNzAgMTcuMDZMMTcuMTUgMTcuMDZRMTcuODQgMTcuMDYgMTguMjMgMTYuNzVRMTguNjIgMTYuNDMgMTguNjIgMTUuODZMMTguNjIgMTUuODZRMTguNjIgMTUuMjMgMTguMjYgMTQuOTVRMTcuOTAgMTQuNjYgMTcuMTQgMTQuNjZMMTcuMTQgMTQuNjZMMTUuNzAgMTQuNjZaTTI0LjY0IDE5LjE2TDI0LjY0IDE5LjE2TDI0LjY0IDEzLjQ3TDI2LjEyIDEzLjQ3TDI2LjEyIDE5LjE4UTI2LjEyIDIwLjAzIDI2LjU1IDIwLjQ4UTI2Ljk4IDIwLjkzIDI3LjgzIDIwLjkzTDI3LjgzIDIwLjkzUTI5LjU0IDIwLjkzIDI5LjU0IDE5LjEzTDI5LjU0IDE5LjEzTDI5LjU0IDEzLjQ3TDMxLjAyIDEzLjQ3TDMxLjAyIDE5LjE3UTMxLjAyIDIwLjUzIDMwLjE1IDIxLjMyUTI5LjI4IDIyLjEyIDI3LjgzIDIyLjEyTDI3LjgzIDIyLjEyUTI2LjM2IDIyLjEyIDI1LjUwIDIxLjMzUTI0LjY0IDIwLjU1IDI0LjY0IDE5LjE2Wk0zNy4xNSAyMkwzNS42NyAyMkwzNS42NyAxMy40N0wzNy4xNSAxMy40N0wzNy4xNSAyMlpNNDcuMzIgMjJMNDEuOTYgMjJMNDEuOTYgMTMuNDdMNDMuNDQgMTMuNDdMNDMuNDQgMjAuODJMNDcuMzIgMjAuODJMNDcuMzIgMjJaTTUzLjEyIDE0LjY2TDUwLjQ5IDE0LjY2TDUwLjQ5IDEzLjQ3TDU3LjI1IDEzLjQ3TDU3LjI1IDE0LjY2TDU0LjU5IDE0LjY2TDU0LjU5IDIyTDUzLjEyIDIyTDUzLjEyIDE0LjY2Wk03MC4xMCAyMkw2Ni45OSAyMkw2Ni45OSAxMy40N0w2OS45MSAxMy40N1E3MS4zNiAxMy40NyA3Mi4xMSAxNC4wNVE3Mi44NyAxNC42MyA3Mi44NyAxNS43OEw3Mi44NyAxNS43OFE3Mi44NyAxNi4zNiA3Mi41NSAxNi44M1E3Mi4yNCAxNy4zMCA3MS42MyAxNy41Nkw3MS42MyAxNy41NlE3Mi4zMiAxNy43NSA3Mi43MCAxOC4yNlE3My4wNyAxOC43OCA3My4wNyAxOS41MUw3My4wNyAxOS41MVE3My4wNyAyMC43MSA3Mi4zMCAyMS4zNlE3MS41MyAyMiA3MC4xMCAyMkw3MC4xMCAyMlpNNjguNDcgMTguMTVMNjguNDcgMjAuODJMNzAuMTIgMjAuODJRNzAuODEgMjAuODIgNzEuMjEgMjAuNDdRNzEuNjAgMjAuMTMgNzEuNjAgMTkuNTFMNzEuNjAgMTkuNTFRNzEuNjAgMTguMTggNzAuMjQgMTguMTVMNzAuMjQgMTguMTVMNjguNDcgMTguMTVaTTY4LjQ3IDE0LjY2TDY4LjQ3IDE3LjA2TDY5LjkyIDE3LjA2UTcwLjYxIDE3LjA2IDcxLjAwIDE2Ljc1UTcxLjM5IDE2LjQzIDcxLjM5IDE1Ljg2TDcxLjM5IDE1Ljg2UTcxLjM5IDE1LjIzIDcxLjAzIDE0Ljk1UTcwLjY3IDE0LjY2IDY5LjkxIDE0LjY2TDY5LjkxIDE0LjY2TDY4LjQ3IDE0LjY2Wk03OS41OCAxOC44Nkw3Ni43MiAxMy40N0w3OC4zNyAxMy40N0w4MC4zMyAxNy41MUw4Mi4yOSAxMy40N0w4My45MyAxMy40N0w4MS4wNyAxOC44Nkw4MS4wNyAyMkw3OS41OCAyMkw3OS41OCAxOC44NloiIGZpbGw9IiNGRkZGRkYiLz48cGF0aCBjbGFzcz0ic3ZnX190ZXh0IiBkPSJNMTA4LjgyIDIwLjkzTDEwOC44MiAyMC45M0wxMTAuMTEgMTkuNDBRMTEwLjc4IDIwLjI3IDExMS41NiAyMC4yN0wxMTEuNTYgMjAuMjdRMTExLjU2IDIwLjI3IDExMS41NyAyMC4yN0wxMTEuNTcgMjAuMjdRMTEyLjA4IDIwLjI3IDExMi4zNSAxOS45NlExMTIuNjIgMTkuNjUgMTEyLjYyIDE5LjA1TDExMi42MiAxOS4wNUwxMTIuNjIgMTUuNDRMMTA5LjcyIDE1LjQ0TDEwOS43MiAxMy42MEwxMTQuOTggMTMuNjBMMTE0Ljk4IDE4LjkxUTExNC45OCAyMC41NCAxMTQuMTUgMjEuMzZRMTEzLjMzIDIyLjE3IDExMS43NCAyMi4xN0wxMTEuNzQgMjIuMTdRMTEwLjgxIDIyLjE3IDExMC4wNiAyMS44NVExMDkuMzAgMjEuNTMgMTA4LjgyIDIwLjkzWk0xMjEuNDggMjJMMTE5LjA2IDIyTDEyMi43NyAxMy42MEwxMjUuMTEgMTMuNjBMMTI4LjgyIDIyTDEyNi4zNiAyMkwxMjUuNjkgMjAuMzdMMTIyLjE0IDIwLjM3TDEyMS40OCAyMlpNMTIzLjkyIDE1LjkzTDEyMi44NCAxOC42MUwxMjUuMDAgMTguNjFMMTIzLjkyIDE1LjkzWk0xMzUuNTYgMjJMMTMxLjk3IDEzLjYwTDEzNC41NCAxMy42MEwxMzYuODIgMTkuMDdMMTM5LjE1IDEzLjYwTDE0MS41MCAxMy42MEwxMzcuOTAgMjJMMTM1LjU2IDIyWk0xNDcuMDcgMjJMMTQ0LjY0IDIyTDE0OC4zNSAxMy42MEwxNTAuNzAgMTMuNjBMMTU0LjQxIDIyTDE1MS45NCAyMkwxNTEuMjggMjAuMzdMMTQ3LjczIDIwLjM3TDE0Ny4wNyAyMlpNMTQ5LjUxIDE1LjkzTDE0OC40MiAxOC42MUwxNTAuNTkgMTguNjFMMTQ5LjUxIDE1LjkzWiIgZmlsbD0iI0ZGRkZGRiIgeD0iMTA4LjcxMDAwMDAwMDAwMDAxIi8+PC9zdmc+)](https://forthebadge.com)

Simple Tic-tac-toe game built with java with simple login/sign up system connected to a database

-- for first time you  have to sign up to get into the game --
## Features:

- you can play vs computer
- you can play vs a friend
-you can chat with all the online players from global chat in main room
- you can also private chat with your friend in the multiplayer room
- game designed to keep track of player's score which increases by playing
- list all players which will show you who is online, offline or in-game
- invite online players so you can play vs them if the other party accepted 
- Leaderboard that shows you top 5 players according to score 

- you can pause the game if you are playing with friend and resume it any time you both like 

- saved games table will show you your saved games 
Table Operations:

## Built With

* [NetBeans](https://netbeans.apache.org/)
* [SceneBuilder](https://gluonhq.com/products/scene-builder/#download)
* [PostgreSQL](https://www.postgresql.org/download/) 
* [JSON-Simple](https://code.google.com/archive/p/json-simple/) 





## Contributors:
- [Yasser Osama](https://github.com/YasserOs)
- [Abdurrhman Sabry](https://github.com/AbdurrhmanSabry)
- [Gehad Mohammad](https://github.com/GehadMohammed)
- [Mostafa Hassan](https://github.com/mostafahassan097)
- [Mahmoud Shabaan](https://github.com/mahmoudshaaban5)
- [Hossam Abdulmageed](https://github.com/abdulmageed02)




