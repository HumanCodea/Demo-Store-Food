create table Food(
    Id int IDENTITY(1,1) Primary key,
    name_food nvarchar(50),
    Manufacturer nvarchar(50),
    Category nvarchar(50),
    Quantity nvarchar(50),
    Years nvarchar(50),
    Prices nvarchar(50)
)

create table MyFood(
    Id int Primary key,
    name_food nvarchar(50),
    Manufacturer nvarchar(50),
    Category nvarchar(50),
    Quantity nvarchar(50),
    Years nvarchar(50),
    Prices nvarchar(50)
)