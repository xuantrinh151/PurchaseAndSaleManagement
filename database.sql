USE [PurchaseAndSaleManagement1]
GO
/****** Object:  Table [dbo].[CTHD]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[MaHD] [int] NOT NULL,
	[MaSP] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC,
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [int] NOT NULL,
	[NguoiLap] [int] NOT NULL,
	[Ngay] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[HoTen] [nvarchar](30) NOT NULL,
	[SDT] [int] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[RoleID] [int] NOT NULL,
	[Anh] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Role]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](30) NOT NULL,
	[Gia] [int] NOT NULL,
	[Anh] [nvarchar](max) NULL,
	[Loai] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 14/03/2022 10:38:32 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Hoten] [nvarchar](30) NOT NULL,
	[TaiKhoan] [nvarchar](30) NOT NULL,
	[MatKhau] [nvarchar](30) NOT NULL,
	[RoleID] [int] NOT NULL,
	[Anh] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[CTHD] ON 

INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (2, 13, 1000, 1)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (2, 15, 3000, 2)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (2, 22, 2000, 16)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (3, 13, 500, 3)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (3, 23, 500, 22)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (4, 12, 2000, 4)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (5, 11, 500, 5)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (6, 3, 2000, 6)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (7, 4, 500, 7)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (9, 24, 500, 13)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (10, 20, 1000, 14)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (13, 2, 500, 11)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (17, 11, 1000, 21)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (17, 21, 1000, 19)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (17, 22, 500, 20)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (17, 23, 200, 17)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (17, 24, 150, 18)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (18, 12, 100, 23)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (18, 13, 500, 24)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (18, 14, 50, 25)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (19, 21, 15, 28)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (19, 23, 40, 27)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (19, 24, 100, 26)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (20, 19, 100, 29)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (20, 22, 200, 30)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (21, 12, 500, 33)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (21, 13, 200, 32)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (21, 20, 100, 31)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (22, 13, 200, 35)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (22, 19, 100, 34)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (23, 22, 200, 37)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (23, 24, 100, 36)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (24, 21, 100, 39)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (24, 23, 500, 38)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (25, 13, 1000, 40)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (25, 22, 100, 41)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (26, 19, 100, 42)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (26, 21, 50, 43)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (27, 12, 100, 45)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (27, 16, 100, 44)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (28, 14, 200, 47)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (28, 17, 50, 48)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (28, 23, 100, 46)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (29, 12, 200, 50)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (29, 13, 500, 49)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (30, 21, 100, 52)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (30, 23, 200, 51)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (31, 17, 100, 53)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (31, 21, 100, 54)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (32, 14, 100, 55)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (32, 18, 50, 57)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (32, 24, 200, 56)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (33, 23, 50, 59)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (33, 24, 100, 58)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (34, 12, 500, 62)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (34, 17, 100, 60)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (34, 20, 100, 61)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (35, 11, 1000, 63)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (35, 12, 500, 64)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (36, 13, 100, 65)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (36, 23, 50, 66)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (37, 13, 100, 68)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (37, 15, 500, 67)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (38, 12, 500, 70)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (38, 16, 100, 69)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (39, 13, 1000, 71)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (39, 20, 50, 72)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (40, 19, 50, 74)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (40, 21, 100, 73)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (41, 15, 100, 76)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (41, 23, 100, 75)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (42, 22, 100, 78)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (42, 24, 50, 77)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (43, 3, 500, 81)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (43, 6, 2000, 80)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (43, 8, 2000, 79)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (44, 6, 1000, 82)
INSERT [dbo].[CTHD] ([MaHD], [MaSP], [SoLuong], [id]) VALUES (44, 9, 1000, 83)
SET IDENTITY_INSERT [dbo].[CTHD] OFF
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (2, 1, 1, CAST(N'2021-01-05' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (3, 2, 1, CAST(N'2021-11-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (4, 3, 2, CAST(N'2021-10-28' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (5, 3, 1, CAST(N'2021-12-25' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (6, 4, 1, CAST(N'2021-01-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (7, 5, 1, CAST(N'2021-02-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (9, 2, 1, CAST(N'2021-03-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (10, 3, 1, CAST(N'2021-03-02' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (13, 6, 1, CAST(N'2021-02-04' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (17, 1, 2, CAST(N'2021-01-03' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (18, 1, 1, CAST(N'2021-01-11' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (19, 2, 2, CAST(N'2021-01-10' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (20, 27, 1, CAST(N'2021-01-23' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (21, 26, 2, CAST(N'2021-02-24' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (22, 33, 2, CAST(N'2021-02-10' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (23, 28, 1, CAST(N'2021-02-04' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (24, 1, 1, CAST(N'2021-02-15' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (25, 3, 2, CAST(N'2021-02-09' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (26, 2, 1, CAST(N'2021-03-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (27, 1, 2, CAST(N'2021-04-22' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (28, 32, 2, CAST(N'2021-04-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (29, 26, 1, CAST(N'2021-04-22' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (30, 2, 2, CAST(N'2021-05-27' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (31, 1, 1, CAST(N'2021-05-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (32, 31, 1, CAST(N'2021-05-04' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (33, 1, 2, CAST(N'2021-06-11' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (34, 30, 2, CAST(N'2021-06-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (35, 27, 1, CAST(N'2021-07-07' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (36, 1, 2, CAST(N'2021-07-09' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (37, 3, 1, CAST(N'2021-08-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (38, 32, 2, CAST(N'2021-08-09' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (39, 31, 2, CAST(N'2021-09-11' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (40, 1, 1, CAST(N'2021-09-01' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (41, 2, 2, CAST(N'2021-11-30' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (42, 33, 1, CAST(N'2021-10-20' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (43, 5, 1, CAST(N'2021-03-09' AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaKH], [NguoiLap], [Ngay]) VALUES (44, 6, 2, CAST(N'2021-06-15' AS Date))
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (1, N'Nguyễn Văn Hợp', 938776266, N'Hải Dương', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (2, N'Trần Thị Chúc', 944776262, N'Yên Bái', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (3, N'Lê Thị Chuyên', 313765282, N'Quảng Ninh', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (4, N'Thủy Cam', 949112365, N'Xuân Quan', 3, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (5, N'Châm Nhân', 912112343, N'Xuân Quan', 3, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (6, N'Văn Hiển', 345123488, N'Xuân Quan', 3, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (26, N'Đàm Tuyết Mai', 981426473, N'Ninh Bình', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (27, N'Lê Thị Khanh', 32161527, N'Hải Phòng', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (28, N'Lê Thị Chín', 97813131, N'Phú Thọ', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (29, N'Đàm Thị Gấm ', 91613731, N'Lâm Đồng', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (30, N'Trịnh Ngọc Lan', 93616742, N'Sơn La', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (31, N'Nguyễn Thị Hà', 35778432, N'Hải Dương', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (32, N'Đàm Văn Trường', 9363472, N'Hà Nội', 4, NULL)
INSERT [dbo].[KhachHang] ([MaKH], [HoTen], [SDT], [DiaChi], [RoleID], [Anh]) VALUES (33, N'Lê Văn Oánh', 9824123, N'Bắc Ninh', 4, NULL)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[Role] ON 

INSERT [dbo].[Role] ([ID], [Name]) VALUES (1, N'ADMIN')
INSERT [dbo].[Role] ([ID], [Name]) VALUES (2, N'USER')
INSERT [dbo].[Role] ([ID], [Name]) VALUES (3, N'SELLER')
INSERT [dbo].[Role] ([ID], [Name]) VALUES (4, N'BUYER')
SET IDENTITY_INSERT [dbo].[Role] OFF
GO
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (1, N'Chậu đỏ miệng tròn e200', 4000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (2, N'Chậu đỏ miệng tròn e260', 6000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (3, N'Chậu đỏ miệng tròn e450', 15000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (4, N'Chảo 20-25cm', 15000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (5, N'Chảo 10-15cm', 10000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (6, N'Giỏ kẹp 5cm', 5000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (7, N'Bịch 13*15', 300, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (8, N'Bịch 14*16', 360, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (9, N'Đồng tiền giống', 5000, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (10, N'Ngọc thảo giống', 600, NULL, N'Nhập')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (11, N'Dừa Cạn', 7000, N'DừaCạn.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (12, N'Ngọc Thảo', 7000, N'NgọcThảo.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (13, N'Xác Pháo', 3000, N'XácPháo.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (14, N'Cẩm Chướng', 10000, N'CẩmChướng.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (15, N'Cúc Vạn Thọ', 4000, N'CúcVạnThọ.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (16, N'Đồng Tiền Cao', 15000, N'ĐồngTiềnCao.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (17, N'Đồng Tiền Lùn', 20000, N'ĐồngTiềnLùn.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (18, N'Cẩm Tú Cầu', 60000, N'CẩmTúCầu.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (19, N'Hoa Diễm Châu', 7000, N'HoaDiễmChâu.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (20, N'Hoa Ngọc Hân', 6000, N'HoaNgọcHân.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (21, N'Cẩm Tú Mai', 4000, N'CẩmTúMai.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (22, N'Thu Hải Đường', 14000, N'ThuHảiĐường.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (23, N'Phong Lữ Đứng', 15000, N'PhongLữĐứng.jpg', N'Xuất')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [Gia], [Anh], [Loai]) VALUES (24, N'Phong Lữ Rủ ', 25000, N'PhongLữRủ.jpg', N'Xuất')
SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([ID], [Hoten], [TaiKhoan], [MatKhau], [RoleID], [Anh]) VALUES (1, N'Phương Viên', N'phuongvien', N'123', 1, N'phuongvien.jpg')
INSERT [dbo].[User] ([ID], [Hoten], [TaiKhoan], [MatKhau], [RoleID], [Anh]) VALUES (2, N'Huyền Nghiêm', N'nghiemthihuyen', N'2803', 1, N'huyennghiem.jpg')
INSERT [dbo].[User] ([ID], [Hoten], [TaiKhoan], [MatKhau], [RoleID], [Anh]) VALUES (3, N'Xuân Trình', N'trinhnx151', N'ahuhu', 2, N'xuantrinh.jpg')
SET IDENTITY_INSERT [dbo].[User] OFF
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FKCTHD343219] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FKCTHD343219]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FKCTHD646691] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FKCTHD646691]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon594700] FOREIGN KEY([NguoiLap])
REFERENCES [dbo].[User] ([ID])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon594700]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKHoaDon785667] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKHoaDon785667]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FKKhachHang359408] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Role] ([ID])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FKKhachHang359408]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FKUser349791] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Role] ([ID])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FKUser349791]
GO
