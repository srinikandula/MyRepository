<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	
	
	<xsl:template match="/">
		<html>
		<body>
			<xsl:apply-templates/>
		</body>
		</html>
	</xsl:template>
	
	
	
	
	<xsl:template match="student">
		<p><b><xsl:value-of select="."/></b></p>
		
	</xsl:template>
	
	<xsl:template match="teacher">
		<h1><xsl:value-of select="."/></h1>
	</xsl:template>
	
	
	
	
</xsl:stylesheet>