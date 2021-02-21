CREATE TABLE songs
(
    id bigserial not null
        constraint songs_pk
            primary key,
    title varchar,
    lyrics text
);

INSERT INTO songs (id, title, lyrics) VALUES (DEFAULT, 'Hotel California', 'On a dark desert highway, cool wind in my hair
                 Warm smell of colitas, rising up through the air
                 Up ahead in the distance, I saw a shimmering light
                 My head grew heavy and my sight grew dim
                 I had to stop for the night
                 There she stood in the doorway;
                 I heard the mission bell
                 And I was thinking to myself,
                 "This could be Heaven or this could be Hell"
                 Then she lit up a candle and she showed me the way
                 There were voices down the corridor,
                 I thought I heard them say...
                 Welcome to the Hotel California
                 Such a lovely place (Such a lovely place)
                 Such a lovely face
                 Plenty of room at the Hotel California
                 Any time of year (Any time of year)
                 You can find it here
                 Her mind is Tiffany-twisted, she got the Mercedes bends
                 She got a lot of pretty, pretty boys she calls friends
                 How…');

