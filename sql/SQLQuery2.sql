USE WebMVC;
GO

-- Xóa bảng nếu có
IF OBJECT_ID('dbo.User', 'U') IS NOT NULL
    DROP TABLE [User];
GO

-- Tạo lại bảng
CREATE TABLE [User] (
    id INT IDENTITY(1,1) PRIMARY KEY,
    email NVARCHAR(100) NOT NULL UNIQUE,
    username NVARCHAR(50) NOT NULL UNIQUE,
    fullname NVARCHAR(100),
    password NVARCHAR(255) NOT NULL,
    avatar NVARCHAR(255),
    roleid INT NOT NULL DEFAULT 3,
    phone NVARCHAR(20),
    createdDate DATE DEFAULT GETDATE()
);
GO

-- Insert dữ liệu mẫu
INSERT INTO [User] (email, username, fullname, password, roleid, phone)
VALUES 
('admin@gmail.com', 'admin', 'Administrator', '123456', 1, '0900000001'),
('manager@gmail.com', 'manager', 'Manager User', '123456', 2, '0900000002'),
('user@gmail.com', 'user', 'Normal User', '123456', 3, '0900000003');
GO
