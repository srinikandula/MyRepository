<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	
	
	<xsl:template match="/">
		<html>
		<body bgcolor="color:red">
			<img src="http://www.starwoodhotels.com/westin/images/wi_logo_homepage.gif"/>
			Hello 
			<xsl:apply-templates/>
		</body>
		</html>
	</xsl:template>
	<xsl:template name="to">
		Welcome to Sherton <xsl:value-of select="to"/>  
	</xsl:template>
	<xsl:template name="HotelName">
		<xsl:value-of select="HotelName"/> 
	</xsl:template>
</xsl:stylesheet>