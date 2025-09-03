CREATE TABLE Category (
    cate_id INT IDENTITY(1,1) PRIMARY KEY,
    cate_name NVARCHAR(255) NOT NULL,
    icons NVARCHAR(255),
    user_id INT NOT NULL,
    CONSTRAINT FK_Category_Users FOREIGN KEY (user_id) REFERENCES Users(id)
);
